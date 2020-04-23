<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 7/21/19
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 

<html>
<head>
    <title>Title</title>
</head>
<body>

<table <%--border="1"--%> align="center" width="600" hieght="1000">
    <caption>Список пользователей</caption>
    <tr>
        <th>Ид.номер</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Логин</th>
        <th>Пароль</th>
    </tr>
    <c:forEach items="${person}" var="item">
        <tr>
            <td><c:out value="${item.id}" /></td>
            <td><c:out value="${item.firstName}" /></td>
            <td><c:out value="${item.lastName}" /></td>
            <td><c:out value="${item.login}" /></td>
            <td><c:out value="${item.password}" /></td>
            <td><a href="/account/${item.id}" >Delete</a></td>
            <td><a href="/account/edit/${item.id}" >Edit</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/">Домой</a>

</body>
</html>
