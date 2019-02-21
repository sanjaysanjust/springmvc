package com.sanjay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerWithAnnotation {

	@RequestMapping("/welcome")
	public ModelAndView displayHello() {
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println("Inside HelloControllerWithAnnotation");
		String value = "Welcome To Spring FrameWork";
		System.out.println("::::" + value);
		andView.addObject("welcomessageWithAnnotation", value);

		return andView;

	}

}
