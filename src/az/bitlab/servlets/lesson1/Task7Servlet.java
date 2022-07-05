package az.bitlab.servlets.lesson1;

import az.bitlab.bd.DBManager;
import az.bitlab.bd.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/task7")
public class Task7Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/task7.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("fd_name");
        String surname = request.getParameter("fd_surname");
        int salary = Integer.parseInt(request.getParameter("f_salary"));
        String club = request.getParameter("fd_club");
        int transferPrice = Integer.parseInt(request.getParameter("fd_transferPrice"));

        Footballer fd = new Footballer();
        fd.setName(name);
        fd.setSurname(surname);
        fd.setSalary(salary);
        fd.setClub(club);
        fd.setTransferPrice(transferPrice);

        DBManager.addFootboller(fd);

        response.sendRedirect("/task7?success");
    }
}
