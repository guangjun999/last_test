<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17
  Time: 16:05
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
        body{
            font-family: "华文细黑";
            width: 100%;
            height:auto;
            background:url("images/lbj.jpg") no-repeat;
            background-size: 100%;
        }
        div{
            opacity: 0.6;
            background: lightgray;
            border: gray;
            position: relative;
            width: 35%;
            height: 50%;
            left: 450px;
            top: 150px;
        }
        form{
            opacity: 2;
            margin-top: 70px;
            margin-left: 160px;
            align-content: center;
        }
        .inp{
            width: 150px;
            height: 25px;
            font-size: 20px;
        }
        #inp1:hover{
            background: tomato;
        }
        a:hover{
            font-size: 25px;
            color: tomato;
        }
    </style>
</head>
<body>
<div>
    <form action="adminLogin" method="post">
        <input name="name" placeholder="帐号" class="inp"><br><br>
        <input type="password" name="pass" placeholder="密码" class="inp"><br><br>
        <input type="submit" value="登录" class="inp" id="inp1"><br><br>
    </form>
</div>
</body>
</html>

