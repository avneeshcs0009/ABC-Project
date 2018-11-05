<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<% out.println("Hello, "+session.getAttribute("name")+" you have successfully Logged In"); %>
		<table>
			<tr>
				<td><a href="Transfer.jsp">Third Party Transfer</a></td>
			</tr>
			<tr>
				<td><a href="BalanceController">Check Balance</a></td>
			</tr>
			<tr>
				<td><a href="Loan.jsp">Apply Loan</a></td>
			</tr>
			<tr>
				<td><a href="ChangePassword.jsp">Change Password</a></td>
			</tr>
			<tr>
				<td><a href="Statement.jsp">Mini Statement</a></td>
			</tr>
			<tr>
				<td><a href="Logout.jsp">Logout</a></td>
			</tr>
		</table>
	</body>
</html>