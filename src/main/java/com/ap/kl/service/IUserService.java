package com.ap.kl.service;

import java.util.List;

import com.ap.kl.entity.Permission;
import com.ap.kl.entity.User;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends ISuperService<User> {

	User selectByLoginName(String loginName);

	void deleteUser(Long userId);
	
	User selectMaxID();
}