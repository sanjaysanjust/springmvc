package com.sanjay.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler) throws IOException {

		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);

		if (dayOfWeek == 1) {
			httpServletResponse.getWriter().write("This apllication will be Down on Every Wednesday, Please try tmrw");
			return false;
		}
		return true;

	}

	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler, ModelAndView view) throws Exception {
		System.out.println("Application Interceptor postHandlleMethod::: Spring MVC called posthandle method for "
				+ httpServletRequest.getRequestURI().toString());
	}

	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler, Exception e) {

		System.out.println("Application Interceptor afterCompletion::: Spring MVC called afterCompletion method for "
				+ httpServletRequest.getRequestURI().toString());

	}
}
