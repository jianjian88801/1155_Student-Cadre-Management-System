package com.dao;

import com.entity.ZuzhipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuzhipingjiaView;

/**
 * 组织评价 Dao 接口
 *
 * @author 
 */
public interface ZuzhipingjiaDao extends BaseMapper<ZuzhipingjiaEntity> {

   List<ZuzhipingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
