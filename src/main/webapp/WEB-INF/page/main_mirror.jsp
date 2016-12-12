<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>开始使用Layui</title>
    <link rel="stylesheet" href="${_ctx}/resource/layui/css/layui.css">
    <script src="${_ctx}/resource/layui/layui.js"></script>
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
<!-- 你的HTML代码 -->


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
            <ul id="demo"></ul>
        </div>
        <!-- 右侧显示 -->
        <div class="right">
            <div class="right_menu">

            </div>
        </div>
    </div>
</div>

<script>


    layui.use(['element','layer','tree'], function(){
        var $ = layui.jquery,
            layer = layui.layer;

       layui.tree({
            elem: '#demo' //传入元素选择器
            ,nodes: ${menuList}
            ,click:function (node) {
               console.log(node)
           }
        });

        layer.msg('${menuList}')

        $(".logout").click(function () {
            if (confirm("是否退出？")) {
                location.href = "${_ctx}/logout.do";
            }
        })

    });


</script>


</body>
</html>