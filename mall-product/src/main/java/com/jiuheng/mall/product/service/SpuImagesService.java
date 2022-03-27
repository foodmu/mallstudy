package com.jiuheng.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chengmaoqiang
 * @email ${email}
 * @date 2022-03-27 14:58:23
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

