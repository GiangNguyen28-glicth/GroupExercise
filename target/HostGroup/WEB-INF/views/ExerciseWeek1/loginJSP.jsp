<%@ page import="com.group.Exercise.Week1.model.Account"%>
<%@ page  import="com.group.Exercise.Week1.model.User"%>
<%@ page  import="com.group.Exercise.Week1.model.Message" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="style.css" rel="stylesheet">
<%
    if(request.getParameter("username") != null && request.getParameter("password")!= null)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        Message messageResponse = new Message("");

        Account account = new Account();
        if(user.getUsername().equals(account.getUSER_NAME()) && user.getUsername().equals(account.getPASS_WORD())){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/ExerciseWeek1/home.jsp");
            requestDispatcher.forward(request,response);
        }else{
            messageResponse.setMessage("Tài khoản hoặc mật khẩu không chính xác");
            request.setAttribute("messageResponse",messageResponse);
        }
    }
%>
<body>
<div id="login">
  <h3 class="text-center text-white pt-5">Login form</h3>
  <div class="container">
    <div id="login-row" class="row justify-content-center align-items-center">
      <div id="login-column" class="col-md-6">
        <div id="login-box" class="col-md-12">
<%--          <form id="login-form" class="form" action="<%=request.getContextPath()%>/exercise-userlogin" method="post">--%>
              <form id="login-form" class="form" action="<%=request.getContextPath()%>/exercise-userlogin2" method="post">
<%--    <form id="login-form" class="form"  method="post">--%>
    <h3 class="text-center text-info">Login</h3>
            <div class="form-group">
              <label for="username" class="text-info">Username:</label><br>
              <input type="text" name="username" id="username" class="form-control">
            </div>
            <div class="form-group">
              <label for="password" class="text-info">Password:</label><br>
              <input type="password" name="password" id="password" class="form-control">
            </div>
            <div class="form-group">
              <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
              <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">

              <p>${messageResponse.message}</p>
            </div>
            <div id="register-link" class="text-right">
              <a href="#" class="text-info">Register here</a>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
</body>