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

<table>
    <c:forEach items="${person}" var="item">
        <tr>
            <td><c:out value="${item.firstName}" /></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
