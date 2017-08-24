package com.ap.kl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ap.kl.entity.User;
import com.ap.kl.entity.vo.MenuVO;
import com.ap.kl.mapper.UserMapper;
import com.ap.kl.service.IRoleService;
import com.ap.kl.service.IUserService;
import com.ap.kl.service.support.BaseServiceImpl;
import com.baomidou.framework.annotations.Log;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	private IRoleService  roleService;
	
    @Log("登录")
	@Override
	public User selectByLoginName(String loginName) {
		User user = new User();
		user.setLoginName(loginName);
		return super.selectOne(user);
	}

    @Log("删除用户")
	@Override
	public void deleteUser(Long userId) {
		//删除用户角色，再删除用户
		roleService.deleteByUserId(userId);
		super.deleteById(userId);
	}

    @Log("添加用户")
    @Override
    public boolean insertSelective(User entity) {
    	System.err.println(" 覆盖父类方法 ");
    	return super.insertSelective(entity);
    }
    
    //@Cacheable(value = "permissionCache", key = "#userId")
    @Log("get User MaxID")
	@Override
	public User selectMaxID() {
		return baseMapper.selectMaxID();
	}
}