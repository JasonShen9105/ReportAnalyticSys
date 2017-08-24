package com.ap.kl.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ap.kl.entity.Deviceinfo;
import com.ap.kl.entity.Doorinfo;
import com.ap.kl.entity.User;
import com.ap.kl.entity.vo.DataSumVO;
import com.ap.kl.service.IAreainfoService;
import com.ap.kl.service.IDeviceinfoService;
import com.ap.kl.service.IDoorinfoService;
import com.ap.kl.service.IRegioninfoService;
import com.ap.kl.service.IRoleService;
import com.baomidou.kisso.annotation.Permission;
import com.baomidou.mybatisplus.plugins.Page;

@Controller
@RequestMapping("/baseinfo/paramset")
public class ParamSetController extends BaseController {
	
	
	@Autowired
	private IDeviceinfoService deviceinfoService;
	
	@Autowired
	private IDoorinfoService doorinfoService;
	
	@Autowired
	private IAreainfoService areainfoService;
	
	@Autowired
	private IRegioninfoService regioninfoService;
	
	
	
	@com.baomidou.kisso.annotation.Permission("5001")
	@RequestMapping("/list")
	public String list(Model model) {
		return "/paramset/list";
	}
	
	@ResponseBody
	@com.baomidou.kisso.annotation.Permission("5001")
	@RequestMapping("/getDeviceList")
	public String getDeviceList() {
		
		int _size = 10, _index = 1;
		if (request.getParameter("_size") != null) {
			_size = Integer.parseInt(request.getParameter("_size"));
		}
		if (request.getParameter("_index") != null) {
			_index = Integer.parseInt(request.getParameter("_index"));
		}
	
		List<Deviceinfo> dsvList = deviceinfoService.selectAllDeviceInfo(_index,_size);
		int totalcount = deviceinfoService.selecAllDeviceCount();
		JSONObject jo = new JSONObject();
		jo.put("total", totalcount);
		jo.put("rows", dsvList);
		return JSON.toJSONString(jo, SerializerFeature.BrowserCompatible);
	}
	
	
	@ResponseBody
	@com.baomidou.kisso.annotation.Permission("5001")
	@RequestMapping("/getDoorList")
	public String getDoorList() {
		
		int _size = 10, _index = 1;
		if (request.getParameter("_size") != null) {
			_size = Integer.parseInt(request.getParameter("_size"));
		}
		if (request.getParameter("_index") != null) {
			_index = Integer.parseInt(request.getParameter("_index"));
		}
	
		List<Doorinfo> dsvList = doorinfoService.selectAllDoorInfo(_index,_size);
		int totalcount = doorinfoService.selectAllDoorCount();
		JSONObject jo = new JSONObject();
		jo.put("total", totalcount);
		jo.put("rows", dsvList);
		return JSON.toJSONString(jo, SerializerFeature.BrowserCompatible);
	}
	
	@ResponseBody
	@com.baomidou.kisso.annotation.Permission("5001")
    @RequestMapping("/edit")
    public String edit(Model model, Long id ) {
    	if ( id != null ) {
			model.addAttribute("device", userService.selectById(id));
		}
    	//model.addAttribute("roleList", roleService.selectList(null));
        return "/paramset/edit";
    }
}
