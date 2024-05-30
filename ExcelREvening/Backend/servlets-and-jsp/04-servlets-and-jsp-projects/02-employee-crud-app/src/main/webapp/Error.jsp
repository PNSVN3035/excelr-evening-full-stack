<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Error</title>
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
			crossorigin="anonymous"
		/>
	</head>
	<body>
		<header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color:tomato">
                <div>
                    <a class="navbar-brand">Employee Management Application</a>
                </div>

                <ul class="navbar-nav">
                    <li><a href="<%=request.getContextPath()%>/list"
                    class="nav-link">Employees</a></li>
                </ul>
            </nav>
        </header>
        <br/>
        
        <center>
        	<h1>Error Has Occurred</h1>
        	<h2><b>Details: </b><%=exception.getMessage()%><br/></h2>
        </center>
	</body>
</html>