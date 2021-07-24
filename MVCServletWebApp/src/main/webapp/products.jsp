<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product..</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>
	<%
	HttpSession ss = request.getSession(false);
	if (ss != null) {
	%>
	<h2>Dear<%=ss.getAttribute("user")%>, Select Products;</h2>
	<%
	} else {
	%>
	<h2>Sorry! No Session</h2>
	<%
	}
	%>
	<jsp:include page="footer.html"></jsp:include>
</body>
</html>