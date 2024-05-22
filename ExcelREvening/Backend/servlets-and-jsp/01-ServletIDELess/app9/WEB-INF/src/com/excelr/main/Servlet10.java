package com.excelr.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet10 extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Hello from servlet10! SOP");
        PrintWriter out = response.getWriter();
        out.println("Hello from Servlet10! from PrintWriter");
    }
}