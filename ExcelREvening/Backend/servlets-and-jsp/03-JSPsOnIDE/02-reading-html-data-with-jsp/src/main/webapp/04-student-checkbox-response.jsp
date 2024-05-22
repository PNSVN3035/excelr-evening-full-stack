<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		The student is confirmed: ${param.firstName} ${param.lastName}  
		<br/><br/>
		The Student's country: ${param.country}
		<br/><br/>
		The Student's favorite programming language: ${param.favoriteLanguage}
		<br/><br/>
		The Student's favorite web Browsers:  
		<ul>
			<li><p><b>Favorite?</b>
			<%=request.getParameter("chrome") %>
			</p></li>
			<li><p><b>Favorite?</b>
			<%=request.getParameter("safari") %>
			</p></li>
			<li><p><b>Favorite?</b>
			<%=request.getParameter("edge") %>
			</p></li>
			<li><p><b>Favorite?</b>
			<%=request.getParameter("brave") %>
			</p></li>
			<li><p><b>Favorite?</b>
			<%=request.getParameter("firefox") %>
			</p></li>
		</ul>
		<br/><br/>
		<p>The Student's favorite IDEs:</p>

	<%
	String s[] = request.getParameterValues("ide");
	if (s != null && s.length != 0) {
	for (String ide: s) {%> 
	<ul><li><% out.println(ide);%></li></ul>
	<%}%> 
	<%}%> 
	
 	
	</body>
</html>
	