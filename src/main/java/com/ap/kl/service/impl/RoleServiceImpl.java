package com.ap.kl.service.impl;

import com.ap.kl.entity.Role;
import com.ap.kl.entity.UserRole;
import com.ap.kl.mapper.RoleMapper;
import com.ap.kl.mapper.UserRoleMapper;
import com.ap.kl.service.IRoleService;
import com.ap.kl.service.support.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Role 表数据服务层接口实现类
 *
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements IRoleService {

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Override
	public void deleteByUserId(Long userId) {
		UserRole ur = new UserRole();
		ur.setUid(userId);
		userRoleMapper.deleteSelective(ur);
	}
}