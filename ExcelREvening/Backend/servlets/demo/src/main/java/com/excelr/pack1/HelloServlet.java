package com.excelr.pack1;

import java.io.IOException; //from JDK
import java.io.PrintWriter;

//from servlet-api.jar file
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//every servelet should be a public class and should be sub-class to HttpServlet
//from HttpServlet several methods are going to be inherited to the sub-class
public class HelloServlet extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//we need print writer to write something to the browser.
		PrintWriter out = response.getWriter(); 
		//response is use for to get the response from the browser
		out.println("Hello from Hello Servlet!");
	}
}

/*
1. In case of core java programs default executable method is main which is static
2. In case of web applications default executable method is non-static service method
3. In every servlet service is the overrided method, and its available in the HttpServlet interface
4. public void service(HttpServletRequest request, HttpServletResponse response) ==> request is for input purpose, response is for output purpose
5. In order to print any output back to the browser, we need to user printwriter object not the System.out
 */
