	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Invalid CustomerID or Password</h1>
		<form action="LoginController">
			<table>
				<tr>
					<td>Customer ID</td>
					<td><input type="text" name="cusid" required autofocus/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					<td><input type="submit" value="LOGIN" /></td>
					<td><a href="ForgotPassword.jsp">Forgot Password?</a></td>
				</tr>
			</table>
		</form>
	</body>
</html>