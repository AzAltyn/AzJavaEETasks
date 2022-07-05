package az.bitlab.servlets.lesson1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task3-1")
public class Task31Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/task3.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name =request.getParameter("name");
        String surname =request.getParameter("surname");

        request.setAttribute("name",name);
        request.setAttribute("surname",surname);

        request.getRequestDispatcher("/task3.jsp").forward(request,response);

    }
}
