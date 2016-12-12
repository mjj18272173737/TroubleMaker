<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>user_detail</title>
    <script type="text/javascript" src="${_ctx}/resource/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<div>
    <form id="user_form" action="${_ctx}/user/save.do?isNew=<c:if test="${empty user}">0</c:if><c:if test="${not empty user}">1</c:if>"
          method="post" id="user_form">
        <input type="hidden" name="userId" value="${user.userId}">
        <div>
            <label>用户名:</label>
            <input type="text" name="userName" value="${user.userName}" <c:if test="${not empty user}">readonly="readonly"</c:if>>
            <label id="error_name"></label>
        </div>
        <c:if test="${empty user}">
            <div>
                <label>密码:</label>
                <input type="password" name="password" value="${user.password}">
            </div>
        </c:if>
        <div>
            <label>真实姓名:</label>
            <input type="text" name="realName" value="${user.realName}">
        </div>
        <div>
            <label>创建时间:</label>
            <input type="text" name="createDate" value="<fmt:formatDate  value="${user.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly">
        </div>
        <div>
            <label>更新时间:</label>
            <input type="text" name="modifyDate" value="<fmt:formatDate  value="${user.modifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly">
        </div>
        <button type="button" id="button">button</button>
        <button type="submit" id="submit">submit</button>
    </form>

</div>
</body>
<script>
    $("#button").click(function (even) {
        var user = $("#user_form").serialize();
        $.post("${_ctx}/user/ajaxSave.do", {"user": user}, function (result) {
            /*location.href = "
            ${_ctx}/user/list.do";*/
        })
    })

    $("#user_form inpit[name='userName']").blur(function (even) {
        var userName = this.val();
        $.get("${_ctx}/user/checkUserName.do", {"userName":userName}, function (result) {
            if (result) {
                $("#error_name").html("用户名已存在")
            }
        })
    })


</script>
</html>
