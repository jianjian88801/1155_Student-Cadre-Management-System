
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 学生干部
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xueshengganbu")
public class XueshengganbuController {
    private static final Logger logger = LoggerFactory.getLogger(XueshengganbuController.class);

    @Autowired
    private XueshengganbuService xueshengganbuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生干部".equals(role))
            params.put("xueshengganbuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xueshengganbuService.queryPage(params);

        //字典表数据转换
        List<XueshengganbuView> list =(List<XueshengganbuView>)page.getList();
        for(XueshengganbuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengganbuEntity xueshengganbu = xueshengganbuService.selectById(id);
        if(xueshengganbu !=null){
            //entity转view
            XueshengganbuView view = new XueshengganbuView();
            BeanUtils.copyProperties( xueshengganbu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengganbuEntity xueshengganbu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xueshengganbu:{}",this.getClass().getName(),xueshengganbu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<XueshengganbuEntity> queryWrapper = new EntityWrapper<XueshengganbuEntity>()
            .eq("username", xueshengganbu.getUsername())
            .or()
            .eq("xueshengganbu_phone", xueshengganbu.getXueshengganbuPhone())
            .or()
            .eq("xueshengganbu_id_number", xueshengganbu.getXueshengganbuIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengganbuEntity xueshengganbuEntity = xueshengganbuService.selectOne(queryWrapper);
        if(xueshengganbuEntity==null){
            xueshengganbu.setInsertTime(new Date());
            xueshengganbu.setCreateTime(new Date());
            xueshengganbu.setPassword("123456");
            xueshengganbuService.insert(xueshengganbu);
            return R.ok();
        }else {
            return R.error(511,"账户或者学生干部手机号或者学生干部身份证号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengganbuEntity xueshengganbu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xueshengganbu:{}",this.getClass().getName(),xueshengganbu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<XueshengganbuEntity> queryWrapper = new EntityWrapper<XueshengganbuEntity>()
            .notIn("id",xueshengganbu.getId())
            .andNew()
            .eq("username", xueshengganbu.getUsername())
            .or()
            .eq("xueshengganbu_phone", xueshengganbu.getXueshengganbuPhone())
            .or()
            .eq("xueshengganbu_id_number", xueshengganbu.getXueshengganbuIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengganbuEntity xueshengganbuEntity = xueshengganbuService.selectOne(queryWrapper);
        if("".equals(xueshengganbu.getXueshengganbuPhoto()) || "null".equals(xueshengganbu.getXueshengganbuPhoto())){
                xueshengganbu.setXueshengganbuPhoto(null);
        }
        if(xueshengganbuEntity==null){
            xueshengganbuService.updateById(xueshengganbu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者学生干部手机号或者学生干部身份证号已经被使用");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xueshengganbuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XueshengganbuEntity> xueshengganbuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XueshengganbuEntity xueshengganbuEntity = new XueshengganbuEntity();
//                            xueshengganbuEntity.setUsername(data.get(0));                    //账户 要改的
//                            //xueshengganbuEntity.setPassword("123456");//密码
//                            xueshengganbuEntity.setXueshengganbuName(data.get(0));                    //学生干部姓名 要改的
//                            xueshengganbuEntity.setXueshengganbuPhone(data.get(0));                    //学生干部手机号 要改的
//                            xueshengganbuEntity.setXueshengganbuIdNumber(data.get(0));                    //学生干部身份证号 要改的
//                            xueshengganbuEntity.setXueshengganbuPhoto("");//照片
//                            xueshengganbuEntity.setXueshengganbuEmail(data.get(0));                    //电子邮箱 要改的
//                            xueshengganbuEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            xueshengganbuEntity.setBumenTypes(Integer.valueOf(data.get(0)));   //部门 要改的
//                            xueshengganbuEntity.setZhiweiTypes(Integer.valueOf(data.get(0)));   //职位 要改的
//                            xueshengganbuEntity.setKaohe(Integer.valueOf(data.get(0)));   //考核 要改的
//                            xueshengganbuEntity.setJijian(Integer.valueOf(data.get(0)));   //纪检 要改的
//                            xueshengganbuEntity.setXinfang(Integer.valueOf(data.get(0)));   //信访 要改的
//                            xueshengganbuEntity.setLvli(Integer.valueOf(data.get(0)));   //履历 要改的
//                            xueshengganbuEntity.setShenji(Integer.valueOf(data.get(0)));   //审计 要改的
//                            xueshengganbuEntity.setInsertTime(date);//时间
//                            xueshengganbuEntity.setCreateTime(date);//时间
                            xueshengganbuList.add(xueshengganbuEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //学生干部手机号
                                if(seachFields.containsKey("xueshengganbuPhone")){
                                    List<String> xueshengganbuPhone = seachFields.get("xueshengganbuPhone");
                                    xueshengganbuPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> xueshengganbuPhone = new ArrayList<>();
                                    xueshengganbuPhone.add(data.get(0));//要改的
                                    seachFields.put("xueshengganbuPhone",xueshengganbuPhone);
                                }
                                //学生干部身份证号
                                if(seachFields.containsKey("xueshengganbuIdNumber")){
                                    List<String> xueshengganbuIdNumber = seachFields.get("xueshengganbuIdNumber");
                                    xueshengganbuIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> xueshengganbuIdNumber = new ArrayList<>();
                                    xueshengganbuIdNumber.add(data.get(0));//要改的
                                    seachFields.put("xueshengganbuIdNumber",xueshengganbuIdNumber);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<XueshengganbuEntity> xueshengganbuEntities_username = xueshengganbuService.selectList(new EntityWrapper<XueshengganbuEntity>().in("username", seachFields.get("username")));
                        if(xueshengganbuEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(XueshengganbuEntity s:xueshengganbuEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //学生干部手机号
                        List<XueshengganbuEntity> xueshengganbuEntities_xueshengganbuPhone = xueshengganbuService.selectList(new EntityWrapper<XueshengganbuEntity>().in("xueshengganbu_phone", seachFields.get("xueshengganbuPhone")));
                        if(xueshengganbuEntities_xueshengganbuPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(XueshengganbuEntity s:xueshengganbuEntities_xueshengganbuPhone){
                                repeatFields.add(s.getXueshengganbuPhone());
                            }
                            return R.error(511,"数据库的该表中的 [学生干部手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //学生干部身份证号
                        List<XueshengganbuEntity> xueshengganbuEntities_xueshengganbuIdNumber = xueshengganbuService.selectList(new EntityWrapper<XueshengganbuEntity>().in("xueshengganbu_id_number", seachFields.get("xueshengganbuIdNumber")));
                        if(xueshengganbuEntities_xueshengganbuIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(XueshengganbuEntity s:xueshengganbuEntities_xueshengganbuIdNumber){
                                repeatFields.add(s.getXueshengganbuIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [学生干部身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        xueshengganbuService.insertBatch(xueshengganbuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        XueshengganbuEntity xueshengganbu = xueshengganbuService.selectOne(new EntityWrapper<XueshengganbuEntity>().eq("username", username));
        if(xueshengganbu==null || !xueshengganbu.getPassword().equals(password))
            return R.error("账号或密码不正确");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(.getRoleTypes());
        String token = tokenService.generateToken(xueshengganbu.getId(),username, "xueshengganbu", "学生干部");
        R r = R.ok();
        r.put("token", token);
        r.put("role","学生干部");
        r.put("username",xueshengganbu.getXueshengganbuName());
        r.put("tableName","xueshengganbu");
        r.put("userId",xueshengganbu.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody XueshengganbuEntity xueshengganbu){
//    	ValidatorUtils.validateEntity(user);
        Wrapper<XueshengganbuEntity> queryWrapper = new EntityWrapper<XueshengganbuEntity>()
            .eq("username", xueshengganbu.getUsername())
            .or()
            .eq("xueshengganbu_phone", xueshengganbu.getXueshengganbuPhone())
            .or()
            .eq("xueshengganbu_id_number", xueshengganbu.getXueshengganbuIdNumber())
            ;
        XueshengganbuEntity xueshengganbuEntity = xueshengganbuService.selectOne(queryWrapper);
        if(xueshengganbuEntity != null)
            return R.error("账户或者学生干部手机号或者学生干部身份证号已经被使用");
        xueshengganbu.setInsertTime(new Date());
        xueshengganbu.setCreateTime(new Date());
        xueshengganbuService.insert(xueshengganbu);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        XueshengganbuEntity xueshengganbu = new XueshengganbuEntity();
        xueshengganbu.setPassword("123456");
        xueshengganbu.setId(id);
        xueshengganbu.setInsertTime(new Date());
        xueshengganbuService.updateById(xueshengganbu);
        return R.ok();
    }


    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        XueshengganbuEntity xueshengganbu = xueshengganbuService.selectOne(new EntityWrapper<XueshengganbuEntity>().eq("username", username));
        if(xueshengganbu!=null){
            xueshengganbu.setPassword("123456");
            boolean b = xueshengganbuService.updateById(xueshengganbu);
            if(!b){
               return R.error();
            }
        }else{
           return R.error("账号不存在");
        }
        return R.ok();
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrXueshengganbu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        XueshengganbuEntity xueshengganbu = xueshengganbuService.selectById(id);
        if(xueshengganbu !=null){
            //entity转view
            XueshengganbuView view = new XueshengganbuView();
            BeanUtils.copyProperties( xueshengganbu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }





}
