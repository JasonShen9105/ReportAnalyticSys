package com.ap.kl.service;

import com.ap.kl.entity.RolePermission;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * RolePermission 表数据服务层接口
 *
 */
public interface IRolePermissionService extends ISuperService<RolePermission> {

	/**
	 * <p>
	 * 判断是否存在角色对应的权限
	 * </p>
	 * 
	 * @param permissionId
	 *            权限ID
	 * @return
	 */
	boolean existRolePermission(Long permissionId);

}