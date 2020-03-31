package com.zpark.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse reqs)
			throws ServletException, IOException {
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
}
