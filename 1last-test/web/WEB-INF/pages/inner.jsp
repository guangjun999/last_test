<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29
  Time: 15:01
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
<li><a href="jumpresume">我的简历</a></li>
<li><a></a></li>
<li><a></a></li>
</body>
</html>

