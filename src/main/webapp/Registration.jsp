<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationServlet" method="Post">

<h1>Registration</h1>
 <label for="fname">First name:</label><br>
   <input type="text" id="fname" name="fname"><br>
   <label for="fname">Password</label><br>
   <input type="password" id="pass" name="pass"><br>
   <label for="fname">Re-Password</label><br>
   <input type="text" id="rpass" name="re-pass" ><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>