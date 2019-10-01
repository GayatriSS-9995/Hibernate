<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style type="text/css">
body{
	background-color:white;
}
p{
	color:crimson;
	font-size: 20px;
	text-align:center;
	
}
div{
	border-style:double;
	border-width:8px;
	border-color:navy;


}
h1 {
	text-align:center;
  color: black;
  text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
</style>
</head>

<body>
<%@ include file="header.html" %>
<div>
<p><a href="login.jsp">Login</a></p>
<hr>
<h1>Welcome to zensar shopee</h1>
<%@ include file="footer.html" %>
</div>
</body>

</html>