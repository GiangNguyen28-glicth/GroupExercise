package com.group.Exercise.Week2.controller;

import com.group.Exercise.Week2.model.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmaiListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String week="week2";
        req.setAttribute("week",week);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/views/ExerciseWeek2/Email.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String week="week2";
        String url="";
        if (action == null) {
            action = "join";
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")){
            req.setAttribute("week",week);
            url = "/views/ExerciseWeek2/Email.jsp";
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            // store data in User object
            UserModel user = new UserModel(firstName, lastName, email);
            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null ||
                    firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "\n" +
                        "The information is required";
                url = "/views/ExerciseWeek2/Email.jsp";
            }
            else {
                message = "";
                url = "/views/ExerciseWeek2/thank.jsp";
            }
            req.setAttribute("user", user);
            req.setAttribute("message", message);
            req.setAttribute("week",week);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(req, resp);
    }
}
