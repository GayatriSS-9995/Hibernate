<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
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
<div>
<body>
<%@ include file="header.html" %>
<c:set var="uname" value="${param.username}" scope="session"></c:set>
<c:url var="productUrlEnc" value="product.jsp"></c:url>

<p>Dear ${param.username} Welcome to online shopping of zensar</p>
<p>Your session time out period is ${pageContext.session.maxInactiveInterval } seconds</p>

<ol>
<li> ${param.book1}</li>
<li> ${param.book2}</li>
</ol>

<p>to view and purchase your products <a href="${ productUrlEnc }">Click here</a></p>
<%@ include file="footer.html" %>
</div>
</body>
</html>