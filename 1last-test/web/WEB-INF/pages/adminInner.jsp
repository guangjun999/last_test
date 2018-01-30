<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
    <style>
        ol{
            list-style: none;
        }
        ol li{
            float: left;
            margin:50px ;
        }
        a:hover{
            color: tomato;
        }
    </style>
</head>
<body>
<ol>
    <li><a>增加部门</a></li>
    <li><a>增加职位</a></li>
    <li><a></a></li>
</ol>
</body>
</html>

