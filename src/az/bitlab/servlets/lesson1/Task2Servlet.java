package az.bitlab.servlets.lesson1;

import az.bitlab.bd.DbMeneger;
import az.bitlab.bd.HrPersons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/task2")
public class Task2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("Hrpersons", DbMeneger.getHrPersons());
        request.getRequestDispatcher("/task2.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
