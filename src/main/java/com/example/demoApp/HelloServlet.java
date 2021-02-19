package com.example.demoApp;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = " you have successfully logged-In!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String[] Name = request.getParameterValues("username");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(new StringBuilder().append("<h1>").append("Hi ").append(Name[0]).append(message).append("</h1>").toString());
        out.println("</body></html>");
    }

    public void destroy() {
    }
}