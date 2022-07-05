<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 3</title>
</head>
<body>
      <form action="/task3-1" method="post">
          <div style="border: black; border-style: wave; width: 300px; height: 50px">
              Name:
              <input name="name"><br>
              Surname:
              <input name="surname"><br>
              <button>SEND</button>
          </div>
      </form>
        <%
            String name = (String) request.getAttribute("name");
            String surname = (String) request.getAttribute("surname");
        %>
        <p class="mt-3 fs-4 fw-bold"><%=name != null ? name : ""%> <%=surname != null ? surname : ""%></p>
</body>
</html>
