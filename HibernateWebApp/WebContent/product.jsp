<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product</title>
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
  text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px grey;
}
</style>
</head>
<div>
<body>
<p><h1> Dear ${sessionScope.uname} Welcome to product service</p></h1>
</div>
</body>
</html>