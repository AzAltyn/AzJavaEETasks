package az.bitlab.servlets.lesson1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

@WebServlet(value = "/task6")
public class Task6Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/task6.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int point = parseInt(request.getParameter("point"));
        String fullname = request.getParameter("fullname");

        if(point>=90){
            out.println("<h2>"+fullname+" got \"A\" for exam!");
        }
        else if(point>=75){
            out.println("<h2>"+fullname+" got \"B\" for exam!");
        }
        else if(point>=60){
            out.println("<h2>"+fullname+" got \"C\" for exam!");
        }
        else if(point>=50){
            out.println("<h2>"+fullname+" got \"D\" for exam!");
        }
        else{
            out.println("<h2>"+fullname+" got \"F\" for exam!");
        }

    }
}
