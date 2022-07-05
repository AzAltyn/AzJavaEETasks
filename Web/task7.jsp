<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 7</title>
    <%@include file="vendor/head.jsp"%>
</head>
<body>
    <%@include file="vendor/navbar.jsp"%>
        <%
            String success = request.getParameter("success");
            if(success!=null){
        %>
            <div class="alert alert-success" role="alert">
                Footballer added successfuly!
            </div>
        <%
            }
        %>
    <form action="/task7" method="post">
        <br><br><label>NAME:</label>
            <input type="text" name="fd_name" placeholder="Insert Name">
        <br><br><label>SURNAME:</label>
            <input type="text" name="fd_surname" placeholder="Insert surname">
        <br><br><label>CLUB:</label>
        <select name="fd_club">
            <option>Real Madrid CF</option>
            <option>Barcelona CF</option>
            <option>Juventus</option>
        </select>
        <br><br><label>SALARY:</label>
            <input type="text" name="f_salary" placeholder="Insert Salary">
        <br><br><label>TRANSFER PRICE:</label>
            <input type="text" name="fd_transferPrice" placeholder="Insert Transfer Price">
        <button class="btn btn-success">Insert Footboller</button>
    </form>
</body>
</html>
