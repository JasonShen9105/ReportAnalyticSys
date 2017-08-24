package com.ap.kl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datainfo/monthinfo")
public class monthController extends BaseController {

	@com.baomidou.kisso.annotation.Permission("6003")
	@RequestMapping("/list")
	public String list(Model model) {
		return "/monthinfo/list";
	}
}
