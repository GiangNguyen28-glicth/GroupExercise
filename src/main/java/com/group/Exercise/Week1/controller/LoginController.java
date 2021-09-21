package com.group.Exercise.Week1.controller;

import com.group.Exercise.Week1.model.Account;
import com.group.Exercise.Week1.model.Message;
import com.group.Exercise.Week1.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/views/ExerciseWeek1/login.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username,password);
        Message messageResponse = new Message("A");

        Account account = new Account();
        if(user.getUsername().equals(account.getUSER_NAME()) && user.getUsername().equals(account.getPASS_WORD())){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/ExerciseWeek1/home.jsp");
            requestDispatcher.forward(req,resp);
        }else{
            messageResponse.setMessage("Tài khoản hoặc mật khẩu không chính xác");
            req.setAttribute("messageResponse",messageResponse);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/ExerciseWeek1/login.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
