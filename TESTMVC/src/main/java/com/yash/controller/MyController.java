package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/welcome")
	public ModelAndView showMessage() {
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("welcome");
		return mv;
	}

}
