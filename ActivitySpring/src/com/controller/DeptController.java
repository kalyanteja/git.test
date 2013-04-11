package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.beans.Dept;
import com.dao.DeptDao;
import com.dao.DeptDs;

@Controller
public class DeptController {

	@RequestMapping("/test.htm")
	public ModelAndView handleRequest(HttpServletRequest rq,
			HttpServletResponse re) throws Exception {
		
		int deptId = Integer.parseInt(rq.getParameter("did"));
		String deptName = rq.getParameter("dname");
		String loc = rq.getParameter("loc");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		XmlWebApplicationContext wc=new XmlWebApplicationContext();
		wc.setServletContext(rq.getSession().getServletContext());
		wc.refresh();
		wc.getServletContext().setAttribute("abc", "abc");
		
		Dept dept = (Dept)wc.getBean("bean1");
		DeptDao dao = (DeptDao)wc.getBean("dao");
		dept.setDeptNo(deptId);
		dept.setDeptName(deptName);
		dept.setLoc(loc);
		DeptDs ds = (DeptDs)wc.getBean("ds");
		dao.insertRecord(dept, ds.getDs());
		return new ModelAndView("/success.jsp");
	}

}
