<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>HTML Forms</h2>

<form action="/save" method="post">
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="firstname" value="Ebenezer"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lastname" value="Doe"><br><br>
  <input type="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>

</body>
</html>