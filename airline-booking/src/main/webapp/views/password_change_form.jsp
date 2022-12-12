      //Writer Pritam Rajendra Chaphekar. 09/12/2022
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password change form</title>
</head>
<body>

  <h3>Enter new password</h3>

<form method="post" action="change-password"  style="max-width: 350px; margin: 0 auto;">
     <div class="border boder-secondary rounded p-3">
 
  <div>
     <p>
         Enter New Password Here : <input required="required" type="password" name="newPassword" />
    </p>
    
    <p class="text-center"> 
          <input type="submit" value="Change Password" class="btn btn-primary"/>
    </p>
 
</div>
 

</div>
</form>

</body>
</html>