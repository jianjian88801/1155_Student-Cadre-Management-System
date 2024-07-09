package com.entity.model;

import com.entity.XueshengganbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生干部
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengganbuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 学生干部姓名
     */
    private String xueshengganbuName;


    /**
     * 学生干部手机号
     */
    private String xueshengganbuPhone;


    /**
     * 学生干部身份证号
     */
    private String xueshengganbuIdNumber;


    /**
     * 头像
     */
    private String xueshengganbuPhoto;


    /**
     * 电子邮箱
     */
    private String xueshengganbuEmail;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 部门
     */
    private Integer bumenTypes;


    /**
     * 职位
     */
    private Integer zhiweiTypes;


    /**
     * 考核
     */
    private Integer kaohe;


    /**
     * 纪检
     */
    private Integer jijian;


    /**
     * 信访
     */
    private Integer xinfang;


    /**
     * 履历
     */
    private Integer lvli;


    /**
     * 审计
     */
    private Integer shenji;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学生干部姓名
	 */
    public String getXueshengganbuName() {
        return xueshengganbuName;
    }


    /**
	 * 设置：学生干部姓名
	 */
    public void setXueshengganbuName(String xueshengganbuName) {
        this.xueshengganbuName = xueshengganbuName;
    }
    /**
	 * 获取：学生干部手机号
	 */
    public String getXueshengganbuPhone() {
        return xueshengganbuPhone;
    }


    /**
	 * 设置：学生干部手机号
	 */
    public void setXueshengganbuPhone(String xueshengganbuPhone) {
        this.xueshengganbuPhone = xueshengganbuPhone;
    }
    /**
	 * 获取：学生干部身份证号
	 */
    public String getXueshengganbuIdNumber() {
        return xueshengganbuIdNumber;
    }


    /**
	 * 设置：学生干部身份证号
	 */
    public void setXueshengganbuIdNumber(String xueshengganbuIdNumber) {
        this.xueshengganbuIdNumber = xueshengganbuIdNumber;
    }
    /**
	 * 获取：头像
	 */
    public String getXueshengganbuPhoto() {
        return xueshengganbuPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setXueshengganbuPhoto(String xueshengganbuPhoto) {
        this.xueshengganbuPhoto = xueshengganbuPhoto;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXueshengganbuEmail() {
        return xueshengganbuEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setXueshengganbuEmail(String xueshengganbuEmail) {
        this.xueshengganbuEmail = xueshengganbuEmail;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：部门
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 设置：职位
	 */
    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：考核
	 */
    public Integer getKaohe() {
        return kaohe;
    }


    /**
	 * 设置：考核
	 */
    public void setKaohe(Integer kaohe) {
        this.kaohe = kaohe;
    }
    /**
	 * 获取：纪检
	 */
    public Integer getJijian() {
        return jijian;
    }


    /**
	 * 设置：纪检
	 */
    public void setJijian(Integer jijian) {
        this.jijian = jijian;
    }
    /**
	 * 获取：信访
	 */
    public Integer getXinfang() {
        return xinfang;
    }


    /**
	 * 设置：信访
	 */
    public void setXinfang(Integer xinfang) {
        this.xinfang = xinfang;
    }
    /**
	 * 获取：履历
	 */
    public Integer getLvli() {
        return lvli;
    }


    /**
	 * 设置：履历
	 */
    public void setLvli(Integer lvli) {
        this.lvli = lvli;
    }
    /**
	 * 获取：审计
	 */
    public Integer getShenji() {
        return shenji;
    }


    /**
	 * 设置：审计
	 */
    public void setShenji(Integer shenji) {
        this.shenji = shenji;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
