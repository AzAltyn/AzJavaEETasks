<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 4</title>
</head>
<body>
    <form action="/task4" method="post">
        <div style="width: 400px; height: 300px">
            Name: <input name="name"><br>
            SurName: <input name="surname"><br>
            Food:
            <select name="food">
                <option>Manty - 900KZT</option>
                <option>Sorpa - 500KZT</option>
                <option>Lagman - 850KZT</option>
                <option>Plov - 950KZT</option>
            </select>
            <button>ORDER</button>
        </div>
    </form>
</body>
</html>
