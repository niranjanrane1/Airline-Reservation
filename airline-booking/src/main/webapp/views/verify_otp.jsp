<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="alert alert-success" text="center" role="alert">
  We have sent OTP to your email
</div>

<form method="post" action="verify-otp"  style="max-width: 350px; margin: 0 auto;">
<div class="border boder-secondary rounded p-3">

</div>
 <font color="red">${wMessage} </font>
  <div>
 
  <div>
     <p>
         Enter OTP here : <input required="required" type="text" name="otp" />
    </p>
    
    <p class="text-center"> 
      <input type="submit" value="Verify" class="btn btn-success"/>
      </p>
         
</div>
 
</div>
</form>

</body>
</html>