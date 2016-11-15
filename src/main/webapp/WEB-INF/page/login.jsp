<%--
  Created by IntelliJ IDEA.
  User: silence
  Date: 2016-10-11
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${_ctx}/resource/css/login/css/default.css">
    <link rel="stylesheet" type="text/css" href="${_ctx}/resource/css/login/css/styles.css">
</head>
<body>
<form id="login_form" name="login_form" action="${_ctx}/login.do" method="post">
    <div class="panel-lite">
        <div class="thumbur">
            <div class="icon-lock"></div>
        </div>
        <h4>用户登录</h4>
        <div class="form-group">
            <input required="required" class="form-control" name="userName" />
            <label class="form-label">用户名    </label>
        </div>
        <div class="form-group">
            <input type="password" required="required" class="form-control" name="password"/>
            <label class="form-label">密　码</label>
        </div><a href="#">忘记密码 ?  </a>
        <button class="floating-btn" name="login_button"><i class="icon-arrow"></i></button>
    </div>
    <script type="text/javascript" src="${_ctx}/resource/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">

        $(document).ready(function (event) {
            var _loginButton = $("#login_form button[name='login_button']");
            var _userName = $("#login_form input[name='userName']");
            var _password = $("#login_form input[name='password']");
            _loginButton.click(function(){
                if (checkStr(_userName) && _password == "") {
                    return false;
                }
                document.login_form.submit();
            })

        })

        function checkStr(s) {
            var pattern = new RegExp("[`%~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）—|{}【】‘；：”“'。，、？]")
            var rs = pattern.test(s);
            return rs;
        }
    </script>
</form>
</body>
</html>
