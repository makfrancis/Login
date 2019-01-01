<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>


<style>
.customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

.customers td, .customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

.customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

.customers tr:hover {
	background-color: #ddd;
}

.customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>



</head>
<body >

		<center>
			<h2>Admin: User List</h2>
		</center>
		<br> <br>
		<a href="insertPage" type="" ><button class="btn btn-success">New User</button></a>
		<center>
			<table class="customers">
				<tr>
					<th>Id</th>
					<th>User Name</th>
					<th>Password</th>
					<th>User Type</th>
					<th>Action</th>
				</tr>

				<c:forEach var="recordItem" items="${userList}">
					<tr>
						<td>${recordItem.userId}</td>
						<td>${recordItem.userName}</td>
						<td>${recordItem.password}</td>
						<td>${recordItem.userType}</td>
						<td style="width:20%">
						<div>	
						<div style="display: inline-block;">
							<form action="/update" method="POST">
							<button type="" value="${recordItem.userName}" name=userName class="btn btn-warning" title="Update">Update</button>
							</form>
						</div>
						<div style="display: inline-block;">
						
							<form action="/deleteUser" method="POST">
						<button class="btn btn-danger " type="" class="btn-delete" value="${recordItem.userName}" name=userName onclick="return confirm('Do you want do delete this record')" title="Delete">Delete</button>
						</form>
						</div>
						</div>
						</td>
					</tr>
				</c:forEach>
			</table>
		</center>


	<br>
	<br>
	<br>
	<br>


</body>
</html>