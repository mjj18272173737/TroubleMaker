<%--
  Created by IntelliJ IDEA.
  User: silence
  Date: 2016-10-14
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="utf-8">
    <title>主页</title>
    <script src="${_ctx}/resource/js/jquery-1.7.2.min.js"></script>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        .mid{
            clear:both; overflow:hidden;
            border-bottom: 1px solid gray;
        }
        .head{
            width: 100%;
            height: 50px;
            margin-bottom: 1px;
            border-bottom: 1px solid gray;
        }
        .left{
            width: 10%;
            height: 850px;
            float: left;
        }
        .right{
            width: 89%;
            height: 850px;
            float: right;
            border-left: 1px solid gray;
            margin-left: 3px;
        }

        .menu, .secend_menu{
            border-bottom:1px solid gray;
            margin-top: 5px;
            cursor:pointer;
        }

        .logout{
            float: right;
        }

    </style>
</head>
<body>
<div>
    <!-- 头部 -->
    <div class="head">

        <div class="logout">
            <button>登出</button>
        </div>
    </div>
    <div class="mid">
        <!-- 左侧菜单 -->
        <div class="left">
            <div>
                <c:forEach items="${menuList}" var="menu">
                    <div class="menu">
                        <span code="${menu['code']}" url="${menu['url']}">${menu['name']}</span>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!-- 右侧显示 -->
        <div class="right">
            <div class="right_menu">

            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(".menu").click(function () {
        var parentCode = $(this).find("span").attr("code");
        $.get("${_ctx}/admin/getMenu.do", {parentCode: parentCode}, function (result) {
            var menuList = result;
            var _html = "";
            var _rightMenu = $(".right_menu");
            for(var i=0; i<menuList.length; i++) {
                _html += '<div class="secend_menu"><span code="'+menuList[i]["code"]+'" url="'+menuList[i]["url"]+'">'+menuList[i]["name"] +'</span></div>';
            }
            _rightMenu.html(_html);
        })
    })

    $(".secend_menu").click(function () {
        var code = $(this).find("span").attr("url");

    });

    $(".logout").click(function () {
        if (confirm("是否退出？")) {
            location.href = "${_ctx}/logout.do";
        }
    })
</script>
</html>