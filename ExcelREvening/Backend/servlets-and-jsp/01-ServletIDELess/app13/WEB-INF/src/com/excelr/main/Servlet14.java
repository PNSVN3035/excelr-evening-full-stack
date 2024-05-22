package com.excelr.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet14 extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Welcome to Servlet14!");
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
        out.println("Goodbye from Servlet14!");
        out.println("<html><body>");

        int status = DbUtil.save(s1, s2);
        if(status == 1)
        {
             out.println("<br/>");
            out.println("saved in the db successfully");
        }else{
            out.println("<br/>");
            out.println("there was some error");
        }
    }
}