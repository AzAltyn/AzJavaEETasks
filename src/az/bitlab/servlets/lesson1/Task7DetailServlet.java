package az.bitlab.servlets.lesson1;

import az.bitlab.bd.DBManager;
import az.bitlab.bd.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/detail")
public class Task7DetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        Footballer footballer = DBManager.getFootboller(id);

        if(footballer!=null){
            request.setAttribute("footbolistid",footballer);
            request.getRequestDispatcher("/task7details.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("task7404.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
