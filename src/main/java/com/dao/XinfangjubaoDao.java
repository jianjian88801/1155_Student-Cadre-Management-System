package com.dao;

import com.entity.XinfangjubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XinfangjubaoView;

/**
 * 信访举报 Dao 接口
 *
 * @author 
 */
public interface XinfangjubaoDao extends BaseMapper<XinfangjubaoEntity> {

   List<XinfangjubaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
