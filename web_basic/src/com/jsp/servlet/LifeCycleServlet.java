package com.jsp.servlet;


import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet("/life/cycle")
public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Get method");
//		req.setAttribute("method", "GET");
//		resp.getWriter().println("Get method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Post method");
//		req.setAttribute("method", "POST");
//		resp.setContentType("text/html;charset=utf-8");
	}

	@Override
	public void destroy()  {
		System.out.println("destory method");

	}

	@Override
	public void init(ServletConfig config) throws ServletException{
		String param = config.getInitParameter("path");
		System.out.println("init param : " + param);
		System.out.println("init method");

	}
	

}
