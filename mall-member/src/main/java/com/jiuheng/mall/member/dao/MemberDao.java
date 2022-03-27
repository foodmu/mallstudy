package com.jiuheng.mall.member.dao;

import com.jiuheng.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cmq
 * @email ${email}
 * @date 2022-03-27 19:17:26
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
