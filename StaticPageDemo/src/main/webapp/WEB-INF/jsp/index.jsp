<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Welcome.. This is starting page.</b>

<form action="loginAction" method="POST">
	Name: <input type="text" name="username"/>
	Password:<input type="password" name="password"/>
	<input type="submit" name="Submit"/>
</form>

First Time User ? <a href="registerform">Register Here</a><br>

</body>
</html>