package com.mycompany.cookies;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieServlet")
public class cookieServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie timeCookie = new Cookie("timeCookie", "");
        timeCookie.setMaxAge(30); 
        response.addCookie(timeCookie);

    }
}
