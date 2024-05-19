package com.excelr.main;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//this servlet will be included in the response of the main servlet
public class IncludedServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//write the included content
		response.getWriter().println("<h2>Included Servlet</h2>");
		response.getWriter().println("<p>This servlet is included in the main servlet by using forward() directive</p>");
	}
}
