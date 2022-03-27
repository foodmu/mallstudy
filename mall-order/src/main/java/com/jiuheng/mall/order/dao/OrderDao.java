package com.jiuheng.mall.order.dao;

import com.jiuheng.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 程茂强
 * @email ${email}
 * @date 2022-03-27 18:44:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
