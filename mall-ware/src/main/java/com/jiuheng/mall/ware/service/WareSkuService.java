package com.jiuheng.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author cmq
 * @email ${email}
 * @date 2022-03-27 19:24:21
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

