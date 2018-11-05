<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Password Error</title>
	</head>
	<body>
		<h1>Confirm Password and New Password Are not Matching. Please try again...</h1>
		<form action="PasswordChangeController">
			<table>
				<tr>
					<td>Old Password</td>
					<td><input type="password" name="oldpassword" required autofocus/></td>
				</tr>
				<tr>
					<td>New Password</td>
					<td><input type="password"name= "newpassword" required /></td>
				</tr>
				<tr>
					<td>Confirm New Password</td>
					<td><input type="password" name="confirmnewpassword" required /></td>
				</tr>
				<tr>
					<td><input type="submit" value="CHANGE" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>