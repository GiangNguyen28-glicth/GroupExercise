<%--
  Created by IntelliJ IDEA.
  User: diepn
  Date: 10/7/2021
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>

<h1>Cookies</h1>

<p>Here's a table with all of the cookies that this
    browser is sending to the current server.</p>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    <c:forEach var="c" items="${cookie}">
        <tr>
            <td>${c.value.name}</td>
            <td>${c.value.value}</td>
        </tr>
    </c:forEach>
</table>

<p><a href="/exercise-download?action=viewAlbums">View list of albums</a></p>

<p><a href="/exercise-download?action=deleteCookies">Delete all persistent cookies</a></p>

</body>
</html>
