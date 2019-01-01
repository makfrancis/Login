
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New User</title>


<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="../../css/regform.css" rel="stylesheet" id="bootstrap-css">
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">



</head>
<body>

<!-- 	<form action="/insertMember" method="POST">
		<div class="form-group">
			<input name="userName" class="form-control" id="userName"
				placeholder="User Name">
		</div>
		<div class="form-group">
			<input name="password" class="form-control" id="password"
				placeholder="Password">
		</div>
		<div class="form-group">
			<input name="userType" class="form-control" id="userType"
				placeholder="User Type">
		</div>
		<button type="submit" class="btn btn-primary">Add</button>

	</form>
	 -->
	 	<br>
		<h1>Create New User</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="/insertMember" method="POST">
					<input class="text" type="text" name="userName" id="" placeholder="Username" required="">
					<br>
					<input class="text" type="password" name="password" placeholder="Password" required="">
					<br>
					<input class="text" type="text" name="userType" id="userType" placeholder="User Type" required="">
					<br>
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="SIGNUP">
				</form>
			</div>
		</div>

</body>
</html>