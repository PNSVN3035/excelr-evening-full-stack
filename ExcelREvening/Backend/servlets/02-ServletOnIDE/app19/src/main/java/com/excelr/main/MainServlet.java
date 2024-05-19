package com.excelr.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//This servlet will be the main servlet that includes the content of another servlet
public class MainServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		//write the main content
		response.getWriter().println("<h1>Main Servlet</h1>");
		response.getWriter().println("<p1> This is the main Servlet</p>");
		
		//Forward the request to IncludedServelt. which then process the request and generates a response
		request.getRequestDispatcher("/includedServlet").forward(request, response);
	}
}
/*
demonstrating the use of include() directive in servlets. The include() directive allows us to include the content of another servlet or JSP page in the response of the current servlet.
*/
