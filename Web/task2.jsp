<%@ page import="az.bitlab.bd.HrPersons" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="az.bitlab.bd.DbMeneger" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 2</title>
</head>
<body>
    <div class="container">
        <div class="col-lg-4 m-auto">
            <table class="table-bordered" style="border-color: black">
                <thead class="table-light">
                <tr style="background-color: grey">
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Department</th>
                    <th>salary</th>
                </tr>
                </thead>
                <%
                    ArrayList<HrPersons> hrPersons = (ArrayList<HrPersons>) request.getAttribute("Hrpersons");
                    for (HrPersons hr:hrPersons) {
                %>
                <tbody>
                <tr>
                    <td><%=hr.getName()%></td>
                    <td><%=hr.getSurname()%></td>
                    <td><%=hr.getDepartment()%></td>
                    <td><%=hr.getSalary()%></td>
                </tr>
                </tbody>
                <%
                    }
                %>
            </table>
        </div>
    </div>
</body>
</html>
