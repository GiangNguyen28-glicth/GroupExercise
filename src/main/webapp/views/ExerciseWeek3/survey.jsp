<%--
  Created by IntelliJ IDEA.
  User: diepn
  Date: 10/7/2021
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <style type=”text/css”>
        span{
        color:white;
    }
        label{color:white;}
    </style>
</head>

<body>
<h1>Thanks for taking our survey!</h1>

<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Heard From:</label>
<span>${user.heardFrom}</span><br>
<label>Updates:</label>
<span>${user.wantsUpdates}</span><br>

<c:if test="${user.wantsUpdates == 'Yes'}">
    <label>Contact Via:</label>
    <span>${user.contactVia}</span>
</c:if>
</body>
</html>
