package com.jiuheng.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ç¨èå¼º
 * @email ${email}
 * @date 2022-03-27 18:44:42
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

