package com.excelr.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet16 extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String skill = req.getParameter("skill");
		String education = req.getParameter("eduaction");
		
		int status = DbUtil.save(firstName, lastName, age, address, gender, skill, education);
		if(status == 1)
		{
			out.println("<html><body>");			
			out.println("<hr/>");			
			out.println("Saved In the DB Successfully!");
		}
		else
		{
			out.println("<hr/>");			
			out.println("There was some error!");
			out.println("<html><body>");
		}
	}
}
