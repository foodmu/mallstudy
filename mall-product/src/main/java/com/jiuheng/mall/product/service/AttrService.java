package com.jiuheng.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chengmaoqiang
 * @email ${email}
 * @date 2022-03-27 14:58:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

