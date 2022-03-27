package com.jiuheng.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author cmq
 * @email ${email}
 * @date 2022-03-27 19:09:04
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

