package com.excelr.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectedServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//set content type
		response.setContentType("text/html");
		
		//write response content
		response.getWriter().println("<h1>This is the Redirected Servlet</h1>");
		response.getWriter().println("<p>This Servlet is redirected by MainServlet using sendRedirect() method</p>");
	}
}
