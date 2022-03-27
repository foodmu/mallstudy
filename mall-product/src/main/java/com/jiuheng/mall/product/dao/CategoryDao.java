package com.jiuheng.mall.product.dao;

import com.jiuheng.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chengmaoqiang
 * @email ${email}
 * @date 2022-03-27 14:58:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
