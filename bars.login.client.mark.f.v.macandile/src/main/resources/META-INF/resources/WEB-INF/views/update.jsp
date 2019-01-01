<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="../../css/regform.css" rel="stylesheet" id="bootstrap-css">
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">





</head>
<body >
		<br>
		<h1>Update User</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				 <form action="/updateUser" method="POST" >
					<input name="userName" type="text" value="${userName}" class="text"class="text" readonly id="userName" placeholder="User Name">
					<br>
					<input class="text" type="password" name="password" id="password" placeholder="Password">
					<input type="submit" value="UPDATE">
				</form>
			</div>
		</div>

</body>
</html>