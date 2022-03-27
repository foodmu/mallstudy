package com.jiuheng.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author cmq
 * @email ${email}
 * @date 2022-03-27 19:09:04
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

