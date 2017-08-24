package com.ap.kl.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ap.kl.entity.Datacounter;
import com.ap.kl.entity.Deviceinfo;
import com.ap.kl.entity.vo.DayCountVO;
import com.ap.kl.service.IDatacounterService;
import com.ap.kl.service.IDeviceinfoService;
import com.ap.kl.service.IRegioninfoService;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Permission;

@Controller
@RequestMapping("/datainfo/dayinfo")
public class DayInfoController extends BaseController {

	
	@Autowired
	private IDatacounterService datacounterService;
	
	@Autowired
	private IDeviceinfoService deviceInfoService;
	
	@com.baomidou.kisso.annotation.Permission("6001")
	@RequestMapping("/list")
	public String list(Model model) {
		return "/dayinfo/list";
	}
	
	@Permission(action = Action.Skip)
	@ResponseBody
	@RequestMapping("/getEchartList")
	public String getEchartList(Model model) {
		List<DayCountVO> dsvList = datacounterService.selectDayInfo();
		//List<Deviceinfo> dsvList = deviceInfoService.selectAllDeviceInfo(pageSize, startIndex)
		List<Integer> category = new ArrayList<Integer>();
        List<BigDecimal> series1 = new ArrayList<BigDecimal>();
        List<BigDecimal> series2 = new ArrayList<BigDecimal>();
        //给图表添加数据
        if(dsvList !=null && dsvList.size()>0){         
            for(DayCountVO dataCounter :dsvList){
            	category.add(dataCounter.getHours());
            	series1.add(dataCounter.getIn_count());
            	series2.add(dataCounter.getOut_count());
            }
        }
        JSONObject jo = new JSONObject();
		jo.put("category", category);
		jo.put("series1", series1);
		jo.put("series2", series2);
		return JSON.toJSONString(jo, SerializerFeature.BrowserCompatible);
	}
	
	
}
