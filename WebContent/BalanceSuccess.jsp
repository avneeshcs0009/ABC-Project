<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<% out.println(session.getAttribute("name")+" your balance is "+session.getAttribute("balance")); %>
	</body>
</html>