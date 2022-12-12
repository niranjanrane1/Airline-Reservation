<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>user login</title>
<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}


form {
	border: 3px solid #f1f1f1;
}

input[type=email], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}
</style>


</head>
<body>
	<form action="userlogin">
		<div class="user">
			Enter Your Email id : <input type="email" name="email" /> <br>
			Enter Your Password : <input type="password" name="password" />
			<br>
			<button type="submit">Login</button>
			<a href="/forgot_password"><label>Forgot Password?		</label> </a>
			<a href="/registration"><label>Register</label> </a>
		</div> 
	</form>



</body>
</html>