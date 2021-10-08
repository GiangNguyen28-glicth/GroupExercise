<%@ include file="/common/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Register</h2>
<p>Submit Your Information.</p>

<div class="container">
    <div id="login-row" class="row justify-content-center align-items-center">
        <div id="login-column" class="col-md-6">
            <div id="login-box" class="col-md-12">
                <form id="login-form" class="form" action="/exercise-download" method="post">
                    <input type="hidden" name="action" value="registerUser">
                    <h3 class="text-center text-info" style="color: black!important;" value="${user.email}">EmailList</h3>
                    <div class="form-group">
                        <label class="text-info" style="color: black!important;">Email</label><br>
                        <input type="email" name="email" id="username" class="form-control" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label for="username" class="text-info" style="color: black!important;" value="${user.firstName}">FirstName:</label>
                        <input type="text" name="firstName" class="form-control" placeholder="First Name">
                    </div>
                    <div class="form-group">
                        <label for="username" class="text-info" style="color: black!important;" value="${user.lastName}">LastName:</label>
                        <input type="text" name="lastName"  class="form-control" placeholder="Last Name">
                    </div>
                    <div class="form-group">
                        <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                    </div>
                </form>
                <p><i style="color: yellow">${message}</i></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>