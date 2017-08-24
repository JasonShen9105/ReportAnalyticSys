package com.ap.kl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datainfo/yearinfo")
public class yearController extends BaseController {
	@com.baomidou.kisso.annotation.Permission("6005")
	@RequestMapping("/list")
	public String list(Model model) {
		return "/yearinfo/list";
	}
}
