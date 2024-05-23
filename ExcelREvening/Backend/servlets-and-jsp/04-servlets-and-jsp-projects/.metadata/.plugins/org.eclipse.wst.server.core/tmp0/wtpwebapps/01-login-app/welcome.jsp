<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome Page</title>
	</head>
	<body>
		<h2>Welcome</h2>
		<%
			java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
		
		String userName = request.getParameter("userName");
		
		out.println("<p>Hello, " + userName + "! Welcome to our Login Application</p>");
		out.println("<p> You have successfully logged in at " + currentDateTime + ".</p>");
		%>
	</body>
</html>