<%--
  Created by IntelliJ IDEA.
  User: CPR199
  Date: 2016-12-06
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>user_detail</title>
    <script type="text/javascript" src="${_ctx}/resource/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<div>
    <form action="${_ctx}/user/save.do" method="post" id="user_form">
        <input type="hidden" name="userId" value="${user.userId}">
        <div>
            <label>用户名:</label>
            <input type="text" name="userName" value="${user.userName}">
        </div>
            <div>
            <label>真实姓名:</label>
            <input type="text" name="realName" value="${user.realName}">
        </div>
        <div>
            <label>创建时间:</label>
            <input type="text" name="createDate" value="${user.createDate}" readonly="readonly">
        </div>
        <div>
            <label>更新时间:</label>
            <input type="text" name="modifyDate" value="${user.modifyDate}" readonly="readonly">
        </div>
        <input type="text" name="password" value="password">
        <button type="button" id="button">button</button>
        <button type="submit" id="submit">submit</button>
    </form>

</div>
</body>
<script>
    $("#button").click(function (even) {
        var user = $("#user_form").serialize();
        $.post("${_ctx}/user/ajaxSave.do",{"user":user},function (result) {
            /*location.href = "${_ctx}/user/list.do";*/
        })
    })
</script>
</html>
