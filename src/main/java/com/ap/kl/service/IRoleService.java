package com.ap.kl.service;

import com.ap.kl.entity.Role;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Role 表数据服务层接口
 *
 */
public interface IRoleService extends ISuperService<Role> {

    void deleteByUserId(Long userId);
}