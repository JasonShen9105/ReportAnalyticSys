package com.ap.kl.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ap.kl.common.Pagination;
import com.ap.kl.entity.vo.DataSumVO;
import com.ap.kl.service.IRoleService;
import com.ap.kl.service.IViewDayCountService;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Permission;

/**
 * <p>
 * 图表演示
 * </p>
 * 
 * @author hubin
 * @Date 2016-05-11
 */
@Controller
@RequestMapping("/sys/echarts")
public class EchartsController extends BaseController {

	
	@Autowired
	private IViewDayCountService viewDayCountService;
	/**
	 * 地图
	 */
	@Permission(action = Action.Skip)
	@RequestMapping("/map")
	public String map(Model model) {
		return "/echarts/map";
	}
	
	@Permission(action = Action.Skip)
	@ResponseBody
	@RequestMapping("/getList")
	public String getList(Model model) {
/*		int _size = 10, _index = 1;
		if (request.getParameter("_size") != null) {
			_size = Integer.parseInt(request.getParameter("_size"));
		}
		if (request.getParameter("_index") != null) {
			int _offset = Integer.parseInt(request.getParameter("_index"));
			_index = _size*(_offset / _size);
		}*/
		int _size = 10, _index = 1;
		if (request.getParameter("_size") != null) {
			_size = Integer.parseInt(request.getParameter("_size"));
		}
		if (request.getParameter("_index") != null) {
			_index = Integer.parseInt(request.getParameter("_index"));
		}
		DataSumVO dSumVO = new DataSumVO();
		BigDecimal incount;
		List<DataSumVO> dsvList = viewDayCountService.select_TodayCount(_index,_size);
		int totalcount = viewDayCountService.select_TotalCount();
		JSONObject jo = new JSONObject();
		jo.put("total", totalcount);
		jo.put("rows", dsvList);
		return JSON.toJSONString(jo, SerializerFeature.BrowserCompatible);
	}
}
