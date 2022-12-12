<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password Form</title>

</head>
<body>
<div class="container text-center">
 <%-- <div th:if="${session.message} >
 
 <div th:classappend="${'alert- '+session.message.type} >
 <span th:text="${session.message.content }"></span>
 </div>
 
 <th:block th:text="${#session.removeAttribute('message') }"></th:block>
 </div> --%>

<div>
<h2>Forgot Password</h2>

</div>

<form method="post" action="send-otp"  style="max-width: 350px; margin: 0 auto;">
<div class="border boder-secondary rounded p-3">

 
 <div>
 
 <p>We will be sending a reset password link to your email.</p>
 
 </div>
 <font color="red">${eMessage} </font>
  <div>
  
     <p>
         Enter Your Email id : <input type="email" name="email" />
    </p>
    
    <p class="text-center"> 
      <input type="submit" value="Send" class="btn btn-primary"/>
      </p>
 
</div>
 

</div>
</form>

</body>
</html>