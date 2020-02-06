<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 2/6/20
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Starter</title>
</head>
<body>
<h1>Halllo!!!! ${person.firstName}</h1>

<form name="Authorization" action="auth" , method="post">
    <b>Введите логин и пароль для входа в &quot;ОС&quot;?</b><br>
    <p><input type="text" name="login" id="login" > <label for="login" > логин</label> <Br>
        <input type="password" name="scret" id="pass"> <label for="pass">Пароль</label> <Br>
    <p><input type="submit" , value="Войти"></p><br>
</form>


<form name="Register" action="register"   method="get">
    <p><input type="submit" , value="Регистрация"></p>
</form>


</body>
</html>
