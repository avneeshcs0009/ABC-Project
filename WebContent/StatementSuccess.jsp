<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Mini Statement</title>
	</head>
	<body>
		<% 
			ArrayList al= (ArrayList)session.getAttribute("al"); 
			out.println(al);
		%>
	</body>
</html>