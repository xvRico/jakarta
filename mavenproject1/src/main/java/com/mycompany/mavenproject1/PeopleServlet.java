package com.mycompany.mavenproject1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/people")
public class PeopleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean loggedIn = false;
        String username = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    loggedIn = true;
                    username = cookie.getValue();
                    break;
                }
            }
        }

        if (!loggedIn) {
            response.sendRedirect("index.html");
        }
        try{
            request.setAttribute("username", username);
            request.getRequestDispatcher("/people.jsp").forward(request, response);
        } catch(Exception e){
            System.out.println("yep");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("people");
    }
}