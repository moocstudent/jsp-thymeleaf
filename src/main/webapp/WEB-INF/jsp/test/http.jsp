<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: tanghuijuan
  Date: 2023/10/24
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>http</title>
</head>
<body>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th>
        <th>Header Value(s)</th>
    </tr>
    <%
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String paraName = (String) headerNames.nextElement();
            out.print("<tr><td>" + paraName + "</td>\n");
            String paramValue = request.getHeader(paraName);
            out.print("<td> " + paramValue + "</td></tr>\n");
        }
    %>
</table>
</body>
</html>
