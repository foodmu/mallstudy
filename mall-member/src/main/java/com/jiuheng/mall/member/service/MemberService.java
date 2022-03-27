package com.jiuheng.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiuheng.common.utils.PageUtils;
import com.jiuheng.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author cmq
 * @email ${email}
 * @date 2022-03-27 19:17:26
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

