package com.excelr.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PostDemoServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Intialized");
	}
	
	public void destroy() 
	{
		System.out.println("Destroyed");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		//get parameters from the request
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		//process the received data
		String fullName = firstName + " " + lastName;
		
		//write response content
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Post Method Demo</h1>");
		out.println("<p> First Name: " + firstName + "</p>");
		out.println("<p> Last Name: " + lastName + "</p>");
		out.println("<p> Full Name: " + fullName + "</p>");
		out.println("</body></html>");
	}
}
