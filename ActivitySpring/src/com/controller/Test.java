package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.test.Bean1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

@Controller
public class Test {
	@RequestMapping("/test.htm")
	public ModelAndView handleRequest(HttpServletRequest rq,
			HttpServletResponse re) throws Exception {
		
		return new ModelAndView("/abc.jsp");
	}
}
