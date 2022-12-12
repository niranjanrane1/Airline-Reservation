<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search</title>
<style>
	body {
  		font-family: Arial, Helvetica, sans-serif;
  		background-color: black;
	}
	 *{
  		box-sizing: border-box;
	}
	
	.container {
 		padding: 16px;
  		background-color: white;
	}
	
	input[type=text], input[type=password] {
  		width: 100%;
  		padding: 15px;
  		margin: 5px 0 22px 0;
  		display: inline-block;
  		border: none;
 		background: #f1f1f1;
	}

	input[type=date], input[type=email],input[type=number] {
  		width: 100%;
  		padding: 15px;
  		margin: 5px 0 22px 0;
  		display: inline-block;
  		border: none;
  		background: #f1f1f1;
	}
	
	input[type=text]:focus, input[type=password]:focus {
  		background-color: #ddd;
  		outline: none;
	}
	
	.registerbtn {
  		background-color: #04AA6D;
  		color: white;
  		padding: 16px 20px;
  		margin: 8px 0;
  		border: none;
  		cursor: pointer;
  		width: 100%;
  		opacity: 0.9;
	}
		
</style>
</head>
<body>
	<form action ="search">
	
		<div class ="container">
			
			Enter date : <input type='date'  name="depatureDateId" />
			
		</div>
		
		<div class = "container">
			Enter Depature(From): <input name = "fromAirport" type = "text"/>
		</div>
	
		<div class = "container">
			Enter Arrivals(To): <input name = "toAirport" type = "text" />
		</div>
		
		<div class = "container">
			<button type = "submit" class ="registerbtn">SUBMIT</button>
		</div>
	</form>		
</body>
</html>