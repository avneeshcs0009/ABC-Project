<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Transfer</title>
	</head>
	<body>
		<form action="TransferController">
			<table>
				<tr>
					<td>Third Party Account Number</td>
					<td><input type="text" name="tpaccno" required autofocus /></td>
				</tr>
				<tr>
					<td>Amount Transfer</td>
					<td><input type="text" name="transamt" required /></td>
				</tr>
				<tr>
					<td><input type="submit" value="TRANSFER" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>