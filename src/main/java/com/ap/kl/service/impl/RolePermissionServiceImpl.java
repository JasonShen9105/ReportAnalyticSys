package com.ap.kl.service.impl;

import org.springframework.stereotype.Service;

import com.ap.kl.entity.RolePermission;
import com.ap.kl.mapper.RolePermissionMapper;
import com.ap.kl.service.IRolePermissionService;
import com.ap.kl.service.support.BaseServiceImpl;
import com.baomidou.framework.annotations.Log;

/**
 *
 * RolePermission 表数据服务层接口实现类
 *
 */
@Service
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermissionMapper, RolePermission>
		implements IRolePermissionService {

	@Log("菜单查询")
	@Override
	public boolean existRolePermission(Long permissionId) {
		RolePermission rp = new RolePermission();
		rp.setPid(permissionId);
		int rlt = baseMapper.selectCount(rp);
		return rlt >= 1;
	}

}