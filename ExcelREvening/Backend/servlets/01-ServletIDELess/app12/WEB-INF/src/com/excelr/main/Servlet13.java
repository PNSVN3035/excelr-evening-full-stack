package com.excelr.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet13 extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Welcome to Servlet13!");
        out.println("<br/>");
        //in order to read any input we use request object's getParameter method
        String s1 = request.getParameter("firstName");
        String s2 = request.getParameter("lastName");
        out.println("Your First Name: " + s1);
        out.println("<br/>");
        out.println("Your Last Name: " + s2);
        out.println("<br/>");
        out.println("You Full Name: " + s1 + " " + s2);
        out.println("<br/>");
        out.println("Goodbye from Servlet13!");
        out.println("<html><body>");
    }
}