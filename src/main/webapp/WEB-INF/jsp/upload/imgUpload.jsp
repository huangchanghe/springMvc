<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19 0019
  Time: 下午 5:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/fileUpload.do" enctype="multipart/form-data" method="post">
    <table>
        <tr>
            <th>选择文件：</th>
        </tr>
        <tr>
            <td>文件一</td>
            <td><input type="file" name="file1"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="上传文件"/></td>
        </tr>
    </table>
    <div >
        <img src="${newFileName}">
    </div>
</form>
</body>
</html>
