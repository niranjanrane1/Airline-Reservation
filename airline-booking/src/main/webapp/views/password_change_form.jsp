<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password change form</title>
<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<style>

form {
	border: 3px solid #f1f1f1;
	background-color: 
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

 input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

 </style>

</head>
<body>

<div class="change"> 

        <h3 align="center">Enter new password</h3>
</div>
 
<form method="post" action="change-password"  style="max-width: 350px; margin: 0 auto;">
     <div class="border boder-secondary rounded p-3">
 
  <div>
     <p align="center">
         Enter New Password Here : <input required="required" type="password" name="newPassword" />
    </p>
    
    <p> 
           <button type="submit" class="btn btn-primary" >Change Password </button>
          <!-- <input type="submit" value="Change Password" class="btn btn-primary"/> -->
    </p>
 
</div>
 

</div>
</form>

</body>
</html>