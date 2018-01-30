<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 10:42
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
</head>
<body>
<form action="modifireResume" method="post">
    <table border="1" cellspacing="0" cellpadding="5">
        <tr>
            <td colspan="5"><center><b>个人简历</b></center></td>
        </tr>
        <tr>
            <td rowspan="5">个人信息</td>
            <td>姓名</td>
            <td><input name="r_name" value="${sessionScope.resume.r_name}"></td>
            <td>性别</td>
            <td>
                <input name="r_gender" required="" value="${sessionScope.resume.r_gender}"></td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td>
                <input name="r_birth" type="date" required="" value="${sessionScope.resume.r_birth}">
            </td>
            <td>籍贯</td>
            <td>
                <input name="r_address" required="" value="${sessionScope.resume.r_address}">
            </td>
        </tr>
        <tr>
            <td>毕业院校</td>
            <td>
                <input name="r_school" required="" value="${sessionScope.resume.r_school}">
            </td>
            <td>学历</td>
            <td>
                <input name="r_education" required="" value="${sessionScope.resume.r_education}">
            </td>
        </tr>
        <tr>
            <td rowspan="2">联系方式</td>
            <td>联系电话</td>
            <td colspan="4">
                <input name="r_phone" required="" value="${sessionScope.resume.r_phone}">
            </td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td colspan="4">
                <input name="r_email" required="" value="${sessionScope.resume.r_email}">
            </td>
        </tr>
        <tr>
            <td >工作经验</td>
            <td colspan="5">
                <textarea name="r_describe" style="border: none;">
                    ${sessionScope.resume.r_describe}
                </textarea>
            </td>
        </tr>
        <tr>
            <td>项目经验</td>
            <td colspan="5">
                <textarea name="r_case" style="border: none;">
                    ${sessionScope.resume.r_case}
                </textarea>
            </td>
        </tr>
        <tr>
            <td>自我评价</td>
            <td colspan="5">
                <textarea name="r_appraise" style="border: none;">
                    ${sessionScope.resume.r_appraise}
                </textarea>
            </td>
        </tr>
        <tr></tr>
    </table>
    <input type="hidden" name="r_uid" value="${sessionScope.user.u_id}">
    <input type="hidden" name="r_id" value="${sessionScope.resume.r_id}">
    <input type="submit" value="确认修改">
</form>
</body>
</html>

