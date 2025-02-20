<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>People Management</title>
</head>
<body>
<h1> Witaj, ${username}!</h1>
<!--<label style="font-weight: bold;">Witaj!!!! ${username}</label>-->
<a href="/mavenproject1/">Logout</a>
<!--<h2>People List</h2>-->
<!--<table border="1">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Date</th>
        <th>Alley</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="person" items="${peopleList}">
        <tr>
            <td>${person.id}</td>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.date}</td>
            <td>${person.alley}</td>
            <td>
                <form action="people" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete"/>
                    <input type="hidden" name="id" value="${person.id}"/>
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<h3>Add Person</h3>
<form action="people" method="post">
    <input type="hidden" name="action" value="add"/>
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName" required/><br/>
    <label for="lastName">Last Name:</label>
    <input type="text" name="lastName" id="lastName" required/><br/>
    <label for="date">Date (yyyy-mm-dd):</label>
    <input type="date" name="date" id="date" required/><br/>
    <label for="alley">Alley:</label>
    <input type="text" name="alley" id="alley"/><br/>
    <button type="submit">Add</button>
</form>-->
</body>
</html>