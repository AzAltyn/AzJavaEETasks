<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 5</title>
</head>
<body>
    <form action="/task5" method="post">
        <div style="height: 300px; width: 400px; border-color: black">
            <div style="text-align: center">
                <h3>FULL NAME:</h3>
                <input type="text" name="name">

                <h3>AGE:</h3>
                <input type="text" name="age">

                <h3>GENDER:</h3>

                    <input type="radio" name="gender" value="gender">Male
                    <input type="radio" name="gender" value="gender">Female
            </div>
            <div><button>SEND</button></div>
        </div>
    </form>
</body>
</html>
