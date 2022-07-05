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
                    <table class="table">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>SURNAME</th>
                            <th>SALARY</th>
                            <th>CLUB</th>
                            <th>TRANCEFER PRICE</th>
                            <th>DETAILS</th>
                        </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Footballer> footballers = (ArrayList<Footballer>) request.getAttribute("footbolist");
                                if(footballers!=null){
                                    for (Footballer fd:footballers) {

                            %>
                        <tr>
                            <td><%=fd.getId()%></td>
                            <td><%=fd.getName()%></td>
                            <td><%=fd.getSurname()%></td>
                            <td><%=fd.getSalary()%></td>
                            <td><%=fd.getClub()%></td>
                            <td><%=fd.getTransferPrice()%></td>
                            <td><a href="/detail?id=<%=fd.getId()%>" class="btn btn-info btn-sm">DETAILS</a> </td>
                        </tr>
                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
