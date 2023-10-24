<%--
  Created by IntelliJ IDEA.
  User: tanghuijuan
  Date: 2023/10/24
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>how bean using</title>
</head>
<body>
<jsp:useBean id="customer" class="com.example.jspthymeleaf.entity.Customer">
    <jsp:setProperty name="customer" property="name" value="zhang3"/>
</jsp:useBean>
在类载入后，我们既可以通过jsp:setProperty和jsp:getProperty动作来修改和检索bean的属性。
<br>
<jsp:getProperty name="customer" property="name"/>

</body>
</html>
