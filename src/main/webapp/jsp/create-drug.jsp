<%--
  Created by IntelliJ IDEA.
  User: k2
  Date: 3/7/20
  Time: 2:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Создание Лекарств</title>
</head>
<body>

<s:form method="post" modelAttribute="drug">
    <table border="1" align="centre" width="600" >
        <tr>
<%--            <th>Ид.номер</th>--%>
            <th>Название</th>
            <th>Тип продукта</th>
            <th>Активные вешесьва</th>
            <th>manufac</th>
            <th>origin</th>
            <th>group</th>
            <th>formpack</th>
        </tr>

        <tr>
            <td> <s:input path="drugName"/> </td>
            <td> <s:input path="productType"/> </td>
            <td> <s:input path="activeIngrds"/> </td>
            <td> <s:input path="manufacturer"/> </td>
            <td> <s:input path="countyOrigin"/> </td>
            <td> <s:input path="pharmaGroup"/> </td>
            <td> <s:input path="formAndPack"/> </td>
        </tr>
    </table>
    <input type="submit" value="Создать">
</s:form>
    <a href="/drug/list" >Отмена</a>


</body>
</html>
