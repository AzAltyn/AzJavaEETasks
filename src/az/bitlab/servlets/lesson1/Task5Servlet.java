package az.bitlab.servlets.lesson1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

@WebServlet(value = "/task5")
public class Task5Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/task5.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        int age = parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(age>=18){
            if(gender == "Male"){
                out.print("<h2>Hello Dear Mister "+name+"!</h2>");
            }
            else{
                out.print("<h2>Hello Dear Miss "+name+"!</h2>");
            }
        }
        else{
            if(gender == "Male"){
                out.print("<h2>Hello Dude Mister "+name+"!</h2>");
            }
            else{
                out.print("<h2>Hello Dude Miss "+name+"!</h2>");
            }
        }
    }
}
