<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="16kb" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
body{
	background-color:black;
}
p{
	color:white;
	font-size: 30px;
	text-align:center;
	
}
div{
	border-style: solid;
	border-width:8px;
	border-color:crimson;


}
h1 {
	text-align:center;
  color: white;
  text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
</style>
</head>
<div>
<body>
<%@ include file="header.html" %>
<form action="checkuser" method="post">
	<p><h1>LOGIN</h1></p>
	<p><input type="text" name="username" placeholder="Enter Username"></p>
	<p><input type="password" name="password" placeholder="Enter password"></p>
	<p><input type="submit" value="Sign In"></p>
	</form>
<%@ include file="footer.html" %>
</div>
</body>
</html>