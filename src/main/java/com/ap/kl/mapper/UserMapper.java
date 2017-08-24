package com.ap.kl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ap.kl.entity.Permission;
import com.ap.kl.entity.User;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User> {

	User selectMaxID();
}