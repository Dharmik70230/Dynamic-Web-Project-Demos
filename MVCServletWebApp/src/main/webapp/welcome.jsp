<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean"
	scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>

	<h2>
		Dear
		<jsp:getProperty property="username" name="ob" />, Welcome to JSP
	</h2>

	<%
	String username = request.getParameter("username");
	session.setAttribute("user", username);
	session.setMaxInactiveInterval(5);
	String url = response.encodeURL("products.jsp");
	%>
	<h2>
		Session Timeout in
		<%=session.getMaxInactiveInterval()%>
		seconds
	</h2>
	<h2>
		View our Products,<a href="<%=url%>"> Click Here</a>
	</h2>



	<jsp:include page="footer.html"></jsp:include>
</body>
</html>