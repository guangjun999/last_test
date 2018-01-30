<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29
  Time: 19:46
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
    <script>
        function checkNum() {
            $.ajax({
                type:"get",
                url:"checkResumeNum",
                success:function (date) {
                    var a = date.length;
                    if (a!=1){
                        return true;
                    }else{
                        alert("不得创建多个简历")
                        return false;
                    }
                }
            })
        }
    </script>
</head>
<body>
<form action="makeResume" method="post" onsubmit="return checkNum()">
    <table border="1" cellspacing="0" cellpadding="5">
        <tr>
            <td colspan="5"><center><b>个人简历</b></center></td>
        </tr>
        <tr>
            <td rowspan="5">个人信息</td>
            <td>姓名</td>
            <td><input name="r_name" required=""></td>
            <td>性别</td>
            <td>
                <input name="r_gender" required=""></td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td>
                <input name="r_birth" type="date" required="">
            </td>
            <td>籍贯</td>
            <td>
                <input name="r_address" required="">
            </td>
        </tr>
        <tr>
            <td>毕业院校</td>
            <td>
                <input name="r_school" required="">
           </td>
            <td>学历</td>
            <td>
                <input name="r_education" required="">
            </td>
        </tr>
        <tr>
            <td rowspan="2">联系方式</td>
            <td>联系电话</td>
            <td colspan="4">
                <input name="r_phone" required="">
            </td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td colspan="4">
                <input name="r_email" required="">
            </td>
        </tr>
        <tr>
            <td >工作经验</td>
            <td colspan="5">
            <textarea name="r_describe" style="border: none;"></textarea>
            </td>
        </tr>
        <tr>
            <td>项目经验</td>
            <td colspan="5">
                <textarea name="r_case" style="border: none;"></textarea>
           </td>
        </tr>
        <tr>
            <td>自我评价</td>
            <td colspan="5">
                <textarea name="r_appraise" style="border: none;"></textarea>
            </td>
        </tr>
        <tr></tr>
    </table>
    <input type="hidden" name="r_uid" value="${sessionScope.user.u_id}">
    <input type="submit" value="创建简历">
</form>
</body>
</html>

