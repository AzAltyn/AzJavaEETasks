<%@ page import="java.util.ArrayList" %>
<%@ page import="az.bitlab.bd.Footballer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Task 7</title>
        <%@include file="vendor/head.jsp"%>
    </head>
    <body>
        <%@include file="vendor/navbar.jsp"%>
        <div class="container">
            <div class="row mt-5">
                <div class="col-sm-12">
                    <%
                        Footballer footballer = (Footballer) request.getAttribute("footbolistid");
                        if(footballer!=null){
                    %>
                    <div class="card" style="width: 18rem;">
                        <img src="https://wallpaperbat.com/img/265556-football-wallpaper.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title"><%=footballer.getName()%></h5>
                            <h5 class="card-title"><%=footballer.getSurname()%></h5>
                            <p class="card-text">Team: <%=footballer.getClub()%></p>
                            <p class="card-text">Salary: <%=footballer.getSalary()%></p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
    </body>
</html>
