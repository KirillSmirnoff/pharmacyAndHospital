<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 3/7/20
  Time: 12:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Update-Person</title>
</head>
<body>

<s:form method="post" modelAttribute="person">
    <fieldset>
        <s:input path="firstName" id="name" />
        <label for="name">ИМЯ</label><br>
        <s:input path="lastName" id="last"/>
        <label for="last">Фамилия</label><br>
        <s:input path="login" id="login"/>
        <label for="login" id="login">Логин</label><br>
        <s:input path="password" id="pas"/>
        <label for="pas" id="pas">Пароль</label>
        <input type="submit" value="Сохранить">
    </fieldset>
</s:form>
<a href="/account/list" >Отмена</a>


</body>
</html>
