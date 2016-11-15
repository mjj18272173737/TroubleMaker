<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="${_ctx}/resource/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${_ctx}/resource/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${_ctx}/resource/easyui/demo.css">
    <script type="text/javascript" src="${_ctx}/resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${_ctx}/resource/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${_ctx}/resource/ztree/js/jquery.ztree.core.min.js"></script>
</head>
<body>
<div class="easyui-layout" style="width:100%;height:800px;">
    <div data-options="region:'north'" style="height:50px;text-align:center">TroubleMaker</div>
    <div data-options="region:'south',split:true" style="height:50px;"></div>
    <div data-options="region:'east',split:true" title="East" style="width:100px;"></div>
    <div data-options="region:'west',split:true" title="West" style="width:100px;"></div>
    <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
        <table class="easyui-datagrid"
               data-options="url:'${_ctx}/admin/getUser.do',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
            <thead>
            <tr>
                <th data-options="field:'userId'" width="80">userId</th>
                <th data-options="field:'userName'" width="100">userName</th>
                <th data-options="field:'password',align:'right'" width="80">password</th>
                <th data-options="field:'isValid',align:'right'" width="80">isValid</th>
                <th data-options="field:'createDate'" width="150">createDate</th>
            </tr>
            </thead>
        </table>
    </div>
</div>

</body>
</html>