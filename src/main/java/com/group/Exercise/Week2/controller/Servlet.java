package com.group.Exercise.Week2.controller;

import com.group.Exercise.Week2.model.UserModel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/exercise-servlet")
public class Servlet extends HttpServlet {
    String week="week2";
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String action = request.getParameter("action");
        String week="week2";
        PrintWriter out = response.getWriter();
        String url="";
        if (action == null) {
            action = "join";
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")){
            request.setAttribute("week",week);
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            // store data in User object
            UserModel user = new UserModel(firstName, lastName, email);
            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null ||
                    firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "\n" +
                        "The information is required";
                request.setAttribute("week",week);
                out.println("<html>\n" +
                        "<head>\n" +
                        "    <title>Title</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<h2>Chapter 5.2 method GET</h2>\n" +
                        "<h2>Join our email list</h2>\n" +
                        "<p>To join our email list, enter your name and\n" +
                        "    email address below.</p>\n" +
                        "\n" +
                        "<div class=\"container\">\n" +
                        "    <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n" +
                        "        <div id=\"login-column\" class=\"col-md-6\">\n" +
                        "            <div id=\"login-box\" class=\"col-md-12\">\n" +
                        "                <form id=\"login-form\" class=\"form\" action=\"/exercise-servlet\" method=\"post\">\n" +
                        "                    <input type=\"hidden\" name=\"action\" value=\"add\">\n" +
                        "                    <h3 class=\"text-center text-info\" style=\"color: black!important;\" value=\"${user.email}\">EmailList</h3>\n" +
                        "                    <div class=\"form-group\">\n" +
                        "                        <label class=\"text-info\" style=\"color: black!important;\">Email</label><br>\n" +
                        "                        <input type=\"email\" name=\"email\" id=\"username\" class=\"form-control\" placeholder=\"Email\">\n" +
                        "                    </div>\n" +
                        "                    <div class=\"form-group\">\n" +
                        "                        <label for=\"username\" class=\"text-info\" style=\"color: black!important;\" value="+user.getFirstName()+">FirstName:</label>\n" +
                        "                        <input type=\"text\" name=\"firstName\" class=\"form-control\" placeholder=\"First Name\">\n" +
                        "                    </div>\n" +
                        "                    <div class=\"form-group\">\n" +
                        "                        <label for=\"username\" class=\"text-info\" style=\"color: black!important;\" value="+user.getLastName()+">LastName:</label>\n" +
                        "                        <input type=\"text\" name=\"lastName\"  class=\"form-control\" placeholder=\"Last Name\">\n" +
                        "                    </div>\n" +
                        "                    <div class=\"form-group\">\n" +
                        "                        <input type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\n" +
                        "                    </div>\n" +
                        "                </form>\n" +
                        "                <p><i style=\"color: yellow\">"+message+"</i></p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>\n");
            }
            else {
                message = "";
                request.setAttribute("week",week);
                out.println("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "</head>\n" +
                        "\n" +
                        "<body>\n" +
                        "<h1>Thanks for joining our email list</h1>\n" +
                        "\n" +
                        "<p>Here is the information that you entered:</p>\n" +
                        "\n" +
                        "<label>Email:</label>\n" +
                        "<span>"+user.getEmail()+"</span><br>\n" +
                        "<label>First Name:</label>\n" +
                        "<span>"+user.getFirstName()+"</span><br>\n" +
                        "<label>Last Name:</label>\n" +
                        "<span>"+user.getLastName()+"</span><br>\n" +
                        "\n" +
                        "<p>To enter another email address, click on the Back\n" +
                        "    button in your browser or the Return button shown\n" +
                        "    below.</p>\n" +
                        "\n" +
                        "<form action=\"/exercise-emailList\" method=\"post\">\n" +
                        "    <input type=\"hidden\" name=\"action\" value=\"join\">\n" +
                        "    <input type=\"submit\" value=\"Return\">\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>\n");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.setAttribute("week",week);
        try {
            out.println("<html>\n" +
                    "<head>\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h2>Chapter 5.2 method GET</h2>\n" +
                    "<h2>Join our email list</h2>\n" +
                    "<p>To join our email list, enter your name and\n" +
                    "    email address below.</p>\n" +
                    "\n" +
                    "<div class=\"container\">\n" +
                    "    <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n" +
                    "        <div id=\"login-column\" class=\"col-md-6\">\n" +
                    "            <div id=\"login-box\" class=\"col-md-12\">\n" +
                    "                <form id=\"login-form\" class=\"form\" action=\"/exercise-servlet\" method=\"post\">\n" +
                    "                    <input type=\"hidden\" name=\"action\" value=\"add\">\n" +
                    "                    <h3 class=\"text-center text-info\" style=\"color: black!important;\" value=\"${user.email}\">EmailList</h3>\n" +
                    "                    <div class=\"form-group\">\n" +
                    "                        <label class=\"text-info\" style=\"color: black!important;\">Email</label><br>\n" +
                    "                        <input type=\"email\" name=\"email\" id=\"username\" class=\"form-control\" placeholder=\"Email\">\n" +
                    "                    </div>\n" +
                    "                    <div class=\"form-group\">\n" +
                    "                        <label for=\"username\" class=\"text-info\" style=\"color: black!important;\" value=\"${user.firstName}\">FirstName:</label>\n" +
                    "                        <input type=\"text\" name=\"firstName\" class=\"form-control\" placeholder=\"First Name\">\n" +
                    "                    </div>\n" +
                    "                    <div class=\"form-group\">\n" +
                    "                        <label for=\"username\" class=\"text-info\" style=\"color: black!important;\" value=\"${user.lastName}\">LastName:</label>\n" +
                    "                        <input type=\"text\" name=\"lastName\"  class=\"form-control\" placeholder=\"Last Name\">\n" +
                    "                    </div>\n" +
                    "                    <div class=\"form-group\">\n" +
                    "                        <input type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\n" +
                    "                    </div>\n" +
                    "                </form>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>\n");
        }
        finally {
            out.close();
        }
    }
}
