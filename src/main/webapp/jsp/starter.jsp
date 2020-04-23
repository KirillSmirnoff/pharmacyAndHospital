<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 2/6/20
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.

1. Get List of Drugs - возвращает список лекарств и их описание

2. Search Drugs by Name - ищет и возвращает список лекарств, соответсвующие вводному значение наименования лекарства

3. Login Admin - логирование в систему админов

4. Register User - регистрация юзера/клиента приложения

5. Login User - логирование в систему юзеров/клиентов

6. Add drug (only Admins are allowed) - добавление лекарств (доступ для Админов)

7. Order Drug by ID (only Users are allowed) - оформить заказ лекарства по ID (доступ только для Пользователей

8. Аутентификацию проводить при помощи токена (json token). Используя https://jwt.io/
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Starter</title>
</head>
<body>
<h1>КакАптека</h1>



<s:form name="Search" method="get" action="search">
<p><input type="text" name="search" id="search" >
    <input type="submit" value="поиск">
</s:form>

    <a href="/account/register" >Зарегистрироваться</a><br>
    <a href="/r" >Войти(пока не работает)</a>
    <a href="/account/list" >Список пользователей</a>
    <a href="/drug/list" >Список лекарств</a>



<%----%>
<%--<h2>Зарегистрироваться</h2>--%>
<%--<form name="Authorization" action="auth" , method="post">--%>
<%--    <b>Введите логин и пароль для входа в &quot;ОС&quot;?</b><br>--%>
<%--    <p><input type="text" name="login" id="login" > <label for="login" > логин</label> <Br>--%>
<%--        <input type="password" name="scret" id="pass"> <label for="pass">Пароль</label> <Br>--%>
<%--    <p><input type="submit" , value="Войти"></p><br>--%>
<%--</form>--%>


<%--<form name="Register" action="register"   method="get">--%>
<%--    <p><input type="submit" , value="Регистрация"></p>--%>
<%--</form>--%>

<%--<h2>Войти</h2>--%>

</body>
</html>
