<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29
  Time: 19:23
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
    <script>
       $(function () {
           $("#a1").click(function () {
               $.ajax({
                   type:"get",
                   url:"checkResumeNum",
                   data:"",
                   success:function (data) {
                       var a = data.length;
                       if (a!=1){
                           $("#a1").href="jumpMakeResume";
                       }else{
                           alert("不得创建多个简历")
                       }
                   }
           })
       })
    </script>
</head>
<body>
<ol>
    <li><a>返回</a></li>
    <li><a id="a1">创建简历</a></li>

</ol>
<c:if test="${sessionScope.resume.r_id>0}">
    <table border="1" cellspacing="0" cellpadding="5">
        <tr>
            <td colspan="5"><center><b>个人简历</b></center></td>
        </tr>
        <tr>
            <td rowspan="5">个人信息</td>
            <td>姓名</td>
            <td>${sessionScope.resume.r_name}</td>
            <td>性别</td>
            <td>${sessionScope.resume.r_gender}</td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td>${sessionScope.resume.r_birth}</td>
            <td>籍贯</td>
            <td>${sessionScope.resume.r_address}</td>
        </tr>
        <tr>
            <td>毕业院校</td>
            <td>${sessionScope.resume.r_school}</td>
            <td>学历</td>
            <td>${sessionScope.resume.r_education}</td>
        </tr>
        <tr>
            <td rowspan="2">联系方式</td>
            <td>联系电话</td>
            <td colspan="4">${sessionScope.resume.r_phone}</td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td colspan="4">${sessionScope.resume.r_email}</td>
        </tr>
        <tr>
            <td >工作经验</td>
            <td colspan="5">${sessionScope.resume.r_describe}</td>
        </tr>
        <tr>
            <td>项目经验</td>
            <td colspan="5">${sessionScope.resume.r_case}</td>
        </tr>
        <tr>
            <td >自我评价</td>
            <td colspan="5">${sessionScope.resume.r_appraise}</td>
        </tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr><a href="jumpToModifireResume?uid=${sessionScope.user.u_id}">修改简历</a></tr>
    </table>


</c:if>

</body>
</html>

