<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add-Flight-Form</title>
<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<script>
$('#add-flight-form').submit(function(e) {
    e.preventDefault();

    var flightNumber = $('#flight-number').val();
    var departureAirport = $('#departure-airport').val();
    var arrivalAirport = $('#arrival-airport').val();
    var departureTime = $('#departure-time').val();
    var arrivalTime = $('#arrival-time').val();

    addFlight(flightNumber, departureAirport, arrivalAirport, departureTime, arrivalTime);
});

</script>
</head>
<body>
		<form id="add-flight-form">
    		<label for="flight-number">Flight Number:</label><br>
    		<input type="text" id="flight-number" name="flight-number"><br>
    		<label for="departure-airport">Departure Airport:</label><br>
		    <input type="text" id="departure-airport" name="departure-airport"><br>
		    <label for="arrival-airport">Arrival Airport:</label><br>
		    <input type="text" id="arrival-airport" name="arrival-airport"><br>
		    <label for="departure-time">Departure Time:</label><br>
		    <input type="datetime-local" id="departure-time" name="departure-time"><br>
		    <label for="arrival-time">Arrival Time:</label><br>
		    <input type="datetime-local" id="arrival-time" name="arrival-time"><br><br>
    <button type="submit">Add Flight</button>
</form>
</body>
</html>