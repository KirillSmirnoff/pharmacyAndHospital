<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 2/24/20
  Time: 1:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table<%-- border="1"--%> align="center" width="600" hieght="1000">
    <caption>Таблица лекарств</caption>
    <tr>
        <th>Ид.номер</th>
        <th>Название</th>
        <th>Тип продукта</th>
        <th>Активные вешесьва</th>
        <th>manufac</th>
        <th>origin</th>
        <th>group</th>
        <th>formpack</th>
    </tr>
    <c:forEach items="${drugs}" var="item">
        <tr>
            <td><c:out value="${item.id}" /></td>
            <td><c:out value="${item.drugName}" /></td>
            <td><c:out value="${item.productType}" /></td>
            <td><c:out value="${item.activeIngrds}" /></td>
            <td><c:out value="${item.manufacturer}" /></td>
            <td><c:out value="${item.countyOrigin}" /></td>
            <td><c:out value="${item.pharmaGroup}" /></td>
            <td><c:out value="${item.formAndPack}" /></td>
            <td><a href="/drug/${item.id}" >Delete</a></td>
            <td><a href="/drug/edit/${item.id}" >Edit</a></td>
        </tr>
    </c:forEach>
    <a href="/drug/create" >Создать</a><br>
    <a href="/" >Домой</a>
</table>

</body>
</html>
