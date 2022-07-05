package az.bitlab.servlets.lesson1;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/task1")

public class Task1Servlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }

    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        String result = "Hello Java EE Bitlab";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lesson 1   Task 1</h1><br>");

        int a=0;
        while (a<10) {
            out.println("<h1>"+result+"</h1>");
            a++;
        }
    }

}