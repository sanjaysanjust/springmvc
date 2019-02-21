package com.sanjay.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sanjay")
public class HelloControllerWithClassPathVariableAnnotation {

	@RequestMapping("/welcome")
	public ModelAndView displayHello() {
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println("Inside HelloControllerWithAnnotation");
		String value = "Welcome To Spring FrameWork :::::   Method Called is -->displayHelloWithPathVariable";
		System.out.println("::::" + value);
		andView.addObject("welcomessageWithAnnotation", value);

		return andView;

	}

	@RequestMapping("/{welcomedynamic}")
	public ModelAndView displayHelloWithDynamicPathVariable() {
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println("Inside HelloControllerWithClassLevelAnnotation And With Dynamic Values");
		String value = "Welcome To Spring FrameWork :::: Method Called is -->displayHelloWithDynamicPathVariable";
		System.out.println("::::" + value);
		andView.addObject("welcomessageWithAnnotation", value);

		return andView;

	}

	@RequestMapping("/{path}/{variableName}")
	public ModelAndView displayHelloWithPathVariable(@PathVariable("path") String path,
			@PathVariable("variableName") String variableName) {
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println(
				"Inside HelloControllerWithAnnotation ::::Method Called is -->displayHelloWithPathVariable  ::: Path Variable Name is "
						+ path + variableName);
		String value = "Welcome To Spring FrameWork";
		System.out.println("::::" + value);
		andView.addObject("welcomessageWithAnnotation", value);

		return andView;

	}

	@RequestMapping("/{kumar}/{initial}/{native}")
	public ModelAndView displayHelloWithPathVariableMap(@PathVariable Map<String, String> pathVars) {

		String name1 = pathVars.get("kumar");
		String name2 = pathVars.get("initial");
		String name3 = pathVars.get("native");
		ModelAndView andView = new ModelAndView("welcome");
		System.out.println(
				"Inside HelloControllerWithAnnotation ::::Method Called is -->displayHelloWithPathVariableMap  ::: Path Variable Name is "
						+ name1 + name2 + "Native is  --->"+name3);
		String value = "Welcome To Spring FrameWork";
		System.out.println("::::" + value);
		andView.addObject("welcomessageWithAnnotation", value);

		return andView;

	}

}
