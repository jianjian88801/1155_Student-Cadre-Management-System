package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengganbuEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 学生干部 服务类
 */
public interface XueshengganbuService extends IService<XueshengganbuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}