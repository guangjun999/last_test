<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17
  Time: 17:33
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
            position: absolute;
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            var x,y,z = false;
            $("#n1").blur(function () {
                $.ajax({
                    type:"get",
                    url:"checkName",
                    data:"name="+$(this).val(),
                    success:function (data) {
                        var a = data.length;
                        if(a!=2){
                            $("#s1").html("×");
                            $("#s1").color = "red";
                            x=false;
                        }else {
                            $("#s1").html("✔");
                            $("#s1").color = "green";
                            x=true;
                        }
                    }
                })
            })
            $("#n2").blur(function () {
                var n2val = $(this).val();
                if(n2val.length=0||n2val==""){
                    $("#s2").html("×");
                    $("#s2").color = "red";
                    y=false;
                }else {
                    $("#s2").html("✔");
                    $("#s2").color = "green";
                    y = true;
                }
            })
            $("#n3").blur(function () {
                var n2val = $("#n2").val();
                var n3val = $(this).val();
                if(n2val!=n3val){
                    $("#s3").html("×");
                    $("#s3").color = "red";
                    z=false;
                }else {
                    $("#s3").html("✔");
                    $("#s3").color = "green";
                    z = true;
                }
            })
            $("form").submit(function () {
                if (x&&y&&z){
                    return true;
                }else {
                    alert("用户名已存在，或者密码不正确！请检查！")
                    return false;
                }
            })
        })
    </script>
</head>
<body>
<div>
    <form action="regest" method="post">
        <input name="u_name" placeholder="帐号" class="inp" id="n1" required=""><span id="s1"></span><br><br>
        <input type="password"  placeholder="密码" class="inp" id="n2" required=""><span id="s2"></span><br><br>
        <input type="password" name="u_pass" placeholder="确认密码" class="inp" id="n3"><span id="s3"></span><br><br>
        <input type="submit" value="注册" class="inp" id="inp1"><br><br>
    </form>
</div>

</body>
</html>

