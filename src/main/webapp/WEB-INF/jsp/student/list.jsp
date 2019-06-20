<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19 0019
  Time: 下午 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<tr>
    <th>id</th>
    <th>姓名</th>
    <th>年龄</th>
</tr>
<br>
<c:forEach var="student" items="${studentList}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
    </tr>
</c:forEach>
</body>
</html>
