package com.sanjay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println("Inside Controller");
		String value = "Welcome To Spring FrameWork";
		System.out.println("::::" + value);
		andView.addObject("welcomessage", value);

		return andView;
	}

}
