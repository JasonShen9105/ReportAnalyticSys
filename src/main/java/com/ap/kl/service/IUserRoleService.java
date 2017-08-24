package com.ap.kl.service;

import com.ap.kl.entity.User;
import com.ap.kl.entity.UserRole;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * UserRole 表数据服务层接口
 *
 */
public interface IUserRoleService extends ISuperService<UserRole> {

	/**
	 * <p>
	 * 判断是否存在角色对应的用户
	 * </p>
	 * 
	 * @param roleId
	 *            角色ID
	 * @return
	 */
	boolean existRoleUser(Long roleId);
	
	UserRole selectMaxID();

}