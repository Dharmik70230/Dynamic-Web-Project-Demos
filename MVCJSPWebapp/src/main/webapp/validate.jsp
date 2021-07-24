<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean"
	scope="request"></jsp:useBean>

<jsp:setProperty property="*" name="ob" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate here</title>
</head>
<body>
	<%
	if (ob.isValid()) {
	%>
	<jsp:forward page="/welcome.jsp">
	<jsp:param value="D" name="dharmik"/>
	<jsp:param value="M" name="maru"/>
	</jsp:forward>
	<%
	} else {
	%>
	<h2 style='color : red'>Invalid Login</h2>
	<jsp:include page="/login.html"></jsp:include>
	<%
	}
	%>

</body>
</html>