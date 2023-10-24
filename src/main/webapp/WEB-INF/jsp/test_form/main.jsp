<%--
  Created by IntelliJ IDEA.
  User: tanghuijuan
  Date: 2023/10/24
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main form</title>
</head>
<body>
<h1>从复选框中读取数据</h1>
<ul>
  <li><p><b>Google is checked?:</b>
  <%= request.getParameter("google")%></p>
  </li>
  <li><p><b>Firefox is checked?:</b>
  <%= request.getParameter("firefox")%></p></li>
  <li><p><b>Taobao is checked?:</b>
  <%= request.getParameter("taobao")%></p></li>
</ul>

</body>
</html>
