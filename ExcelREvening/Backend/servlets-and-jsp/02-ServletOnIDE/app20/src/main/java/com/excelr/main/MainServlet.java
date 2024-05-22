package com.excelr.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//MainServlet redirects the request to RedirectedServlet, which then process the request and generates a response
public class MainServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//redirecting the request to RedirectServlet
		response.sendRedirect("redirectedServlet");
	}
}
