package com.ap.kl.mapper;

import com.ap.kl.entity.UserRole;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * UserRole 表数据库控制层接口
 *
 */
public interface UserRoleMapper extends AutoMapper<UserRole> {
	UserRole selectMaxID();
}