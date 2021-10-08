package com.group.Exercise.Week1.controller;

import com.group.Exercise.Week1.model.Account;
import com.group.Exercise.Week1.model.Message;
import com.group.Exercise.Week1.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController2 extends HttpServlet {
    Message messageResponse = new Message("");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String week="week1";
        req.setAttribute("week",week);
        PrintWriter out = resp.getWriter();
        out.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n" +
                "<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n" +
                "<link href=\"style.css\" rel=\"stylesheet\">\n" +
                "<body>\n" +
                "<div id=\"login\">\n" +
                "    <h3 class=\"text-center text-white pt-5\" style=\"color: black!important;\">Login form</h3>\n" +
                "    <div class=\"container\">\n" +
                "        <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n" +
                "            <div id=\"login-column\" class=\"col-md-6\">\n" +
                "                <div id=\"login-box\" class=\"col-md-12\">\n" +
                "                    <form id=\"login-form\" class=\"form\" action=\"/exercise-userlogin2\" method=\"post\">\n" +
                "                        <div class=\"form-group\">\n" +
                "                            <label for=\"username\" class=\"text-info\" style=\"color: black!important;\">Username:</label><br>\n" +
                "                            <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\">\n" +
                "                        </div>\n" +
                "                        <div class=\"form-group\">\n" +
                "                            <label for=\"password\" class=\"text-info\" style=\"color: black!important;\">Password:</label><br>\n" +
                "                            <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\">\n" +
                "                        </div>\n" +
                "                        <div class=\"form-group\">\n" +
                "                            <label for=\"remember-me\" class=\"text-info\"><span style=\"color: black!important;\">Remember me</span> <span><input id=\"remember-me\" name=\"remember-me\" type=\"checkbox\"></span></label><br>\n" +
                "                            <input type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\n" +
                "                           <p>"+messageResponse.getMessage()+ "</p>\n" +
                "                        </div>\n" +
                "                        <div id=\"register-link\" class=\"text-right\">\n" +
                "                            <a href=\"#\" class=\"text-info\" style=\"color: black!important;\">Register here</a>\n" +
                "                        </div>\n" +
                "                    </form>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username,password);

        Account account = new Account();
        if(user.getUsername().equals(account.getUSER_NAME()) && user.getPassword().equals(account.getPASS_WORD())){
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html>\n" +
                    "<head>\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>Login Success!</h1>\n" +
                    "</body>\n" +
                    "</html>");
        }else{
            messageResponse.setMessage("Username or Password not correct!");
            req.setAttribute("messageResponse",messageResponse);
            resp.sendRedirect("/exercise-userlogin2");
        }
    }
}
