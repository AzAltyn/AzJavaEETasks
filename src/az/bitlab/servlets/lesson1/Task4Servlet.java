package az.bitlab.servlets.lesson1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task4")
public class Task4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/task4.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String food = request.getParameter("food");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>"+name+" "+surname+" "+" ordered"+" "+food+"</h1>");

    }
}
