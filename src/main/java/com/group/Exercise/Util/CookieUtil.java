package com.group.Exercise.Util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;

public class CookieUtil {
    public static String getCookie(Cookie[] cookies,String cookiename){
        String cookieValue="";
        if(cookies!=null){
            for(Cookie cookie:cookies){
                if(cookiename.equals(cookie.getName())){
                    cookieValue=cookie.getValue();
                }
            }
        }
        return  cookieValue;
    }
}
