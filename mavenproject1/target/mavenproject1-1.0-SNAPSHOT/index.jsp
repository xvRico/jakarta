<%-- 
    Document   : index
    Created on : Feb 4, 2025, 6:54:00 PM
    Author     : piotr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="login" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required />
    <button type="submit">Login</button>
</form>
</body>
</html>
