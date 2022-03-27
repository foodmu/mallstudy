package com.jiuheng.mall.product.dao;

import com.jiuheng.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chengmaoqiang
 * @email ${email}
 * @date 2022-03-27 14:58:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
