<%@ include file="/common/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Survey</h2>
<p>Your Information.</p>
<form action="/exercise-survey" method="post">
    <div class="container">
        <div id="login-column" class="col-md-6">
            <div id="login-box" class="col-md-12">
                <form id="login-form" class="form" >
                    <input type="hidden" name="action" value="add">
                    <h3 class="text-center text-info" style="color: black!important;" value="${user.email}">EmailList</h3>
                    <div class="form-group">
                        <label class="text-info" style="color: black!important;">Email</label><br>
                        <input type="email" name="email" class="form-control" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label class="text-info" style="color: black!important;" value="${user.firstName}">FirstName:</label>
                        <input type="text" name="firstName" class="form-control" placeholder="First Name">
                    </div>
                    <div class="form-group">
                        <label class="text-info" style="color: black!important;" value="${user.lastName}">LastName:</label>
                        <input type="text" name="lastName"  class="form-control" placeholder="Last Name">
                    </div>
                </form>
                <p><i style="color: yellow">${message}</i></p>
            </div>
        </div>
        <div class="col-md-6">
            <h2>How did you hear about us?</h2>
            <p><input type=radio name="heardFrom" value="Search Engine" style="transform: scale(1.5);">  Search engine
                <input type=radio name="heardFrom" value="Word of mouth" style=" transform: scale(1.5);">  Word of mouth
                <br>
                <input type=radio name="heardFrom" value="Advertisement" style=" transform: scale(1.5);"> Advertisement</p>

            <h3>Do you want to update?</h3>
            <p><input type="checkbox" name="wantsUpdates" checked style=" transform: scale(1.5); " >    YES, I'd like that.</p>

            <p>ContactVia:
                <select name="contactVia" size="1.7px">
                    <option value="" disabled selected>Choose your option</option>
                    <option value="Email">Email</option>
                    <option value="Phone">Phone</option>
                    <option value="Other">Other</option>
                </select>
            </p>
        </div>
        <input style="margin-top: 17px" type="submit" name="submit" class="btn btn-info btn-md" value="submit">
    </div>


</form>
</body>
</html>