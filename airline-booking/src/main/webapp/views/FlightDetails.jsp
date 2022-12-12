<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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

	<form action = "reservation" method = "GET">
		<div>
			Flight Details:
			
			<table border="1">
				<tr>
					<th>Flight</th>
					<th>Date</th>
					<th>Flight Name</th>
					<th>Depature Airport</th>
					<th>Arrival Airport</th>
					<th>Booking</th>
				<tr>
				<c:forEach items= "${flightDetails }" var = "item" >
					<tr>
						<td> ${item.flightId }</td>
						<td> ${item.depatureDate }</td>
						<td> ${item.flightName }</td>
						<td> ${item.fromAirport }</td>
						<td> ${item.toAirport }</td>
						<td> <input type = "submit"/></td>
					</tr>	
				</c:forEach>	
			</table>
		</div>
	</form>


</body>
</html>