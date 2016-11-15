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
    <title>login</title>
    <style>
    *{
        margin:0;
        padding:0;
    }
    </style>
</head>
<body>
<form id="login_form" name="login_form" action="${_ctx}/login.do" method="post">
    <div style="text-align: center;">
        <div>
            <label>用户名：</label><input type="text" name="userName" >
        </div>
        <div>
            <label>密码：</label><input type="password" name="password">
        </div>
        <div>
            <button name="login_button">提交</button>
        </div>
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
