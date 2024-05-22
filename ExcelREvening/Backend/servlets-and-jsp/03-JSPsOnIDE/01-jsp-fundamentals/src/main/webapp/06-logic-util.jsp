<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%-- <%@ page import="com.excelr.main.*"%>--%>  
  <%--  <%@ page import="com.excelr.main.LogicUtil,java.util.ArrayList"%>--%>  
<%@ page import="com.excelr.main.LogicUtil"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>call java class from jsp</title>
	</head>
	<body>
		<h3>Hello World of Java!</h3>
		Lower case of EXCELR : <%= LogicUtil.makeItLower("EXCELR")%>
	</body>
</html>