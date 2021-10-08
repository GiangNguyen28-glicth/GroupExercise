package com.group.Exercise.Week3;

import com.group.Exercise.Week2.model.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/exercise-survey")
public class SurveyServlet extends HttpServlet {
    String week="week3";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd=req.getRequestDispatcher("/views/ExerciseWeek3/index.jsp");
        req.setAttribute("week",week);
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("week",week);
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String heardFrom = req.getParameter("heardFrom");
        String wantsUpdates = req.getParameter("wantsUpdates");
        String contactVia = req.getParameter("contactVia");
        String message="";
        String url="";
        if (firstName == null || lastName == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
            message = "\n" +
                    "The information is required";
            req.setAttribute("message", message);
            getServletContext()
                    .getRequestDispatcher("/views/ExerciseWeek3/index.jsp")
                    .forward(req, resp);
        }
        if (heardFrom == null) {
            heardFrom = "NA";
        }
        if (wantsUpdates == null) {
            wantsUpdates = "No";
        }
        else {
            wantsUpdates = "Yes";
        }
        UserModel user = new UserModel();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setHeardFrom(heardFrom);
        user.setWantsUpdates(wantsUpdates);
        user.setContactVia(contactVia);

        req.setAttribute("user", user);

        getServletContext()
                .getRequestDispatcher("/views/ExerciseWeek3/survey.jsp")
                .forward(req, resp);
    }
}
