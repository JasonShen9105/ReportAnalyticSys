package com.ap.kl.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ap.kl.common.StrUtil;
import com.ap.kl.entity.Role;
import com.ap.kl.entity.User;
import com.ap.kl.entity.UserRole;
import com.ap.kl.service.IRoleService;
import com.ap.kl.service.IUserRoleService;
import com.ap.kl.service.IUserService;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Permission;
import com.baomidou.kisso.common.encrypt.SaltEncoder;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * <p>
 * 用户管理相关操作
 * </p>
 *
 *
 * @Author Jack
 * @Date 2016/4/15 15:03
 */
@Controller
@RequestMapping("/perm/user")
public class UserController extends BaseController {

	@Autowired
	private IUserService userService;

	@Autowired
	private IRoleService roleService;

	@Autowired
	private IUserRoleService userroleService;
	
	@Permission("2001")
	@RequestMapping("/list")
	public String list(Model model) {
		return "/user/list";
	}

    @Permission("2001")
    @RequestMapping("/edit")
    public String edit(Model model, Long id ) {
    	if ( id != null ) {
			model.addAttribute("user", userService.selectById(id));
		}
    	model.addAttribute("roleList", roleService.selectList(null));
        return "/user/edit";
    }
    
	@SuppressWarnings("null")
	@ResponseBody
	@Permission("2001")
	@RequestMapping("/editUser")
	public String editUser() {
		boolean rlt1 = false;
		boolean rlt2 = false;
		boolean rlt = false;
		//boolean urret = false;
		User user = new User();
		UserRole userRole = new UserRole();
		String LoginName = request.getParameter("loginName");
		String Password = request.getParameter("password");
		String Rid = request.getParameter("rid");
		String Id = request.getParameter("id");
		
		user.setPassword(SaltEncoder.md5SaltEncode(LoginName, Password));
		user.setType(Integer.valueOf(Rid));
		user.setLoginName(LoginName);
		if (!StrUtil.isEmpty(Id)) {
			user.setId(Long.parseLong(Id));
			//userRole.setId(Long.parseLong(Id));
			userRole.setRid(Long.parseLong(Id));
			userRole.setUid(Long.parseLong(Rid));
			rlt1 = userroleService.updateSelectiveById(userRole);
			UserRole whereUserR = new UserRole();
			whereUserR.setRid(Long.parseLong(Id));
			userroleService.update(userRole,whereUserR);
			rlt2 = userService.updateSelectiveById(user);
		} else {
			User us = userService.selectMaxID();
			user.setId(us.getId()+1L);
			user.setCrTime(new Date());
			user.setLastTime(user.getCrTime());
			userRole.setRid(Long.parseLong(Id));
			userRole.setUid(Long.parseLong(Rid));
			rlt1 = userroleService.insertSelective(userRole);
			rlt2 = userService.insertSelective(user);
		}
		if (!rlt1 && !rlt2)
		{
			rlt = true;
		}
		else
		{
			rlt = false;
		}
		return callbackSuccess(rlt);
	}

	@ResponseBody
	@Permission("2001")
	@RequestMapping("/getUserList")
	public String getUserList() {
		Page<User> page = getPage();
		return jsonPage(userService.selectPage(page, null));
	}

	@ResponseBody
	@Permission("2001")
	@RequestMapping("/delUser/{userId}")
	public String delUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
		return Boolean.TRUE.toString();
	}

	@ResponseBody
	@Permission("2001")
	@RequestMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		return userService.selectById(userId);
	}


	/**
	 * 设置头像
	 */
	@Permission(action = Action.Skip)
	@RequestMapping(value = "/setAvatar", method = RequestMethod.GET)
	public String setAvatar() {
		return "/user/avatar";
	}
}
