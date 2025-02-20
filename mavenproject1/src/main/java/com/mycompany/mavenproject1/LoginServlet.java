package com.mycompany.mavenproject1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        if (username != null && !username.isEmpty()) {

            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60 * 30);
            response.addCookie(cookie);

            response.sendRedirect("people");
        } else {
            response.getWriter().write("Login cannot be empty!");
        }
    }
}