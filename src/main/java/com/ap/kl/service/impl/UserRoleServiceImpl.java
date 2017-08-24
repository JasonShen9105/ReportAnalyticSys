package com.ap.kl.service.impl;

import org.springframework.stereotype.Service;

import com.ap.kl.entity.UserRole;
import com.ap.kl.mapper.UserRoleMapper;
import com.ap.kl.service.IUserRoleService;
import com.ap.kl.service.support.BaseServiceImpl;

/**
 *
 * UserRole 琛ㄦ暟鎹湇鍔″眰鎺ュ彛瀹炵幇绫� *
 */
@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

	@Override
	public boolean existRoleUser( Long roleId ) {
		UserRole ur = new UserRole();
		ur.setRid(roleId);
		int rlt = baseMapper.selectCount(ur);
		return rlt >= 1;
	}

	public UserRole selectMaxID()
	{
		return baseMapper.selectMaxID();
	}
}