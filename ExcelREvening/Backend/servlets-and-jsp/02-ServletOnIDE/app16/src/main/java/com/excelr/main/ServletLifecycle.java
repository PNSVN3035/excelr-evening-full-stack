package com.excelr.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletLifecycle extends HttpServlet {

	//init method performs initialization tasks, such as loading configuration data
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Servlet Initialized");	
	}

	//clean up the resources used by the servlet
	//performs cleanup tasks, such as closing database connections
	public void destroy() 
	{
		System.out.println("Servlet Destroyed");
	}

	//doGet() method in this servlet is responsible for generating a simple HTML response when the servlet receives an HTTP GET request
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//sets the context type of the response to text/html	
		//indicating that response will contain HTML content	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Servlet LifeCycle Demo</h1>");		
		out.println("</body></html>");
	}

}
