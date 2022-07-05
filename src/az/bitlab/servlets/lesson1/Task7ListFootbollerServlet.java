package az.bitlab.servlets.lesson1;

import az.bitlab.bd.DBManager;
import az.bitlab.bd.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/listFootboller")
public class Task7ListFootbollerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Footballer> footballers = DBManager.getFootballers();
        request.setAttribute("footbolist",footballers);
        request.getRequestDispatcher("/task7b.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
