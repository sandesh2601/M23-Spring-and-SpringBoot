package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("admin")
	public String print(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("Hello! "+name);
		session.setAttribute("name",name);
		System.out.println("TNS M23 BATCH");
		return "home.jsp";
		
	}

}