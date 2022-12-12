<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src = "https://code.jquery.com/jquery-3.6.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passenger Details</title>
<style>
	table {
  empty-cells:hide;
}
</style>
<!-- <script>
$( document ).ready(function() {
	
	 if ($('#passengerDetailsTable tbody tr').length == 0){
		
	     $('#passengerDetailsTable thead th').css('display','none');
	 }
});
 $('#postButton').click(function() {
	debugger;
    var PassengerDetail = [];
    $('#passengerDetailBody tr').each(function(index, item) {
        var $item = $(item);
        PassengerDetail.push({
            name: $item.find("td input[name='name']").val(),
            phoneNumber: $item.find("td input[name='phoneNumber']").val(),
            passportNo: $item.find("td input[name='passportNo']").val()
        });
    });
    $.ajax({
        url: 'http://localhost:8080/addPassengerDetails',
        method: 'POST',
        contentType : false,
        processData : false,
        data: PassengerDetail
    })
    .done(function(PassengerDetail) {
        // handle success
        alert("success");
    })
    .fail(function() {
        // handle fail
        alert("fail");
    });
}); */
</script>

<script>	
	function submitForm(){
		debugger;
		var PassengerDetail = []; 
	  /*   $('#passengerDetailsTable tbody tr td').each(function(index, item) {
	    	alert("inside passenger body");
	        var $item = $(item);
	        PassengerDetail.push({
	            name: $item.find("td input[name='name']").val(),
	            phoneNumber: $item.find("td input[name='phoneNumber']").val(),
	            passportNo: $item.find("td input[name='passportNo']").val(),
	        });
	    }); */
	    var myRows = [];
	    var headersText = [];
	    var $headers = $("th");
	    
	    var $rows = $("tbody tr").each(function(index) {
	    	  $cells = $(this).find("td");
	    	  myRows[index] = {};
	    	  
	    	  $cells.each(function(cellIndex) {
	    		    // Set the header text
	    		    if (headersText[cellIndex] === undefined) {
	    		      headersText[cellIndex] = $($headers[cellIndex]).text();
	    		    }
	    		    // Update the row object with the header/cell combo
	    			myRows[index][headersText[cellIndex]] = $(this).text();
	    		});
	    	});	  
	  
	    		alert(JSON.stringify(myRows));

	    //alert(JSON.stringify(PassengerDetail));
	    $.ajax({
	        url: 'http://localhost:8080/addPassengerDetails',
	        method: 'POST',
	        contentType : false,
	        processData : false,
	        data: myRows,
	        sucess: function(response){
	        	alert(JSON.stringify(response));
	        }
	    })
	    
	}
	
	function add(){
		// Append passenger Details to the table
	    $("#passengerDetailsTable tbody").append(
	        "<tr>" +
	        "<td>" + $("#fullName").val() + "</td>" +
	        "<td>" + $("#phoneNumber").val() + "</td>" +
	        "<td>" + $("#passportNo").val() + "</td>" +
	      	"<td>" +
	        "<input type='button' onclick='passengerDetailDelete(this)' value ='Delete'/>"  +
	        "</td>" + 
	        "</tr>");
		
	}
	
	function passengerDetailDelete(r){
		var i = r.parentNode.parentNode.rowIndex;
		document.getElementById("passengerDetailsTable").deleteRow(i);
	}
</script>
 --></head>
<body>
	<h2>Enter Passenger Details</h2>
	
	<form action = "addPassengerDetails">
		<div>
			Enter Full Name: <input type = "text" id = "fullName" name = "name"/>
			
			Enter Phone Number: <input type = "text" name ="phoneNumber" id = "phoneNumber" maxlength="10" />
		</div>
		
		<div>
			Enter Aadhar/Passport Number: <input type = "text" id = "passportNo" name ="passportNo"/>
		</div>
		
		<div>
			<input type = "submit"  value = "submit" />
			 
		</div>
	
	<!-- <div>
		
		<table id="passengerDetailsTable" border = "1">
            <thead>
            	<th>Name</th>
            	<th>Phone Number</th>
            	<th>Passport Number/Adhar </th> 
            	<th>Delete Entry </th>
            </thead>
            <tbody></tbody>
        </table>
	
		<button id = "postButton" onclick ="submitForm()" value="submit">Submit</button>
	</div> -->
	  
	</form>
</body>
</html>