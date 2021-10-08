package com.group.Exercise.Week4;

import com.group.Exercise.Util.CookieUtil;
import com.group.Exercise.Week2.controller.Servlet;
import com.group.Exercise.Week2.model.UserModel;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(urlPatterns = "/exercise-download")
public class DownLoadServlet extends HttpServlet {
    String week="week4";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("week",week);
        String action=req.getParameter("action");
        if(action==null){
            action="viewAlbums";
        }
        String url="/views/ExerciseChapter7/index.jsp";
        if(action.equals("viewAlbums")){
            url = "/views/ExerciseChapter7/index.jsp";
        }
        else if(action.equals("viewCookies")){
            url = "/views/ExerciseChapter7/ViewAllCookies.jsp";
        }
        else if(action.equals("deleteCookies")){
            url = deleteCookies(req, resp);
        }
        else {
            url = checkUser(req, resp);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("week",week);
        String action = req.getParameter("action");

        // perform action and set URL to appropriate page
        String url = "/views/ExerciseChapter7/index.jsp";
        if (action.equals("registerUser")) {
            url = registerUser(req, resp);
        }

        // forward to the view
        getServletContext()
                .getRequestDispatcher(url)
                .forward(req, resp);
    }
    private String checkUser(HttpServletRequest request,
                             HttpServletResponse response) {

        String productCode = request.getParameter("productCode");
        HttpSession session = request.getSession();
        ServletContext sc = this.getServletContext();
        String productPath = sc.getRealPath("/WEB-INF/products.txt");
        ProductModel product = ProductIO.getProduct(productCode, productPath);
        session.setAttribute("product", product);
        session.setAttribute("productCode", productCode);
        UserModel user = (UserModel) session.getAttribute("user");
        String url;
        // if User object doesn't exist, check email cookie
        if (user == null) {
            Cookie[] cookies = request.getCookies();
            String emailAddress =
                    CookieUtil.getCookie(cookies, "userEmail");

            // if cookie doesn't exist, go to Registration page
            if (emailAddress == null || emailAddress.equals("")) {
                url = "/views/ExerciseChapter7/Register.jsp";
            }
            // if cookie exists, create User object and go to Downloads page
            else {
                String path = sc.getRealPath("/WEB-INF/EmailList.txt");
                user = UserIO.getUser(emailAddress, path);
                session.setAttribute("user", user);
                url = "/views/ExerciseChapter7/" + productCode + "download.jsp";
            }
        }
        // if User object exists, go to Downloads page
        else {
            url = "/views/ExerciseChapter7/" + productCode + "download.jsp";
        }
        return url;
    }

    private String registerUser(HttpServletRequest request,
                                HttpServletResponse response) {
        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        UserModel user = new UserModel();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        ServletContext sc=getServletContext();
        HttpSession session=request.getSession();
        session.setAttribute("user",user);

        Cookie c=new Cookie("userEmail",email);
        c.setMaxAge(60*60*24*365*3);
        response.addCookie(c);

        // create and return a URL for the appropriate Download page
        String productCode = (String) session.getAttribute("productCode");
        String url = "/views/ExerciseChapter7/" + productCode + "download.jsp";
        return url;
    }

    private String deleteCookies(HttpServletRequest request,
                                 HttpServletResponse response) {
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        String url = "/views/ExerciseChapter7/DeleteAllCookies.jsp";
        return url;
    }
}
