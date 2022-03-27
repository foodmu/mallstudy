package com.jiuheng.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chengmaoqiang
 * @email ${email}
 * @date 2022-03-27 14:58:24
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

