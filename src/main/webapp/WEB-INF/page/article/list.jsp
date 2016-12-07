<%--
  Created by IntelliJ IDEA.
  User: CPR199
  Date: 2016-12-06
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body {
            font-family: arial;
        }

        table {
            border: 1px solid #ccc;
            width: 80%;
            margin:0;
            padding:0;
            border-collapse: collapse;
            border-spacing: 0;
            margin: 0 auto;
        }

        table tr {
            border: 1px solid #ddd;
            padding: 5px;
        }

        table th, table td {
            padding: 10px;
            text-align: center;
        }

        table th {
            text-transform: uppercase;
            font-size: 14px;
            letter-spacing: 1px;
        }

        @media screen and (max-width: 600px) {

            table {
                border: 0;
            }

            table thead {
                display: none;
            }

            table tr {
                margin-bottom: 10px;
                display: block;
                border-bottom: 2px solid #ddd;
            }

            table td {
                display: block;
                text-align: right;
                font-size: 13px;
                border-bottom: 1px dotted #ccc;
            }

            table td:last-child {
                border-bottom: 0;
            }

            table td:before {
                content: attr(data-label);
                float: left;
                text-transform: uppercase;
                font-weight: bold;
            }
        }

        .note{max-width: 80%; margin: 0 auto;}

    </style>
</head>
<body>
<div>
    <table>
        <thead>
            <tr>
                <th>序号</th>
                <th>username</th>
                <th>password</th>
                <th>realname</th>
                <th>createdate</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${userList}" var="u" varStatus="index">
                <tr>
                    <td>${index.index + 1}</td>
                    <td>${u.userName}</td>
                    <td>${u.password}</td>
                    <td>${u.realName}</td>
                    <td>${u.createDate}</td>
                    <td><a href="${_ctx}/${u.userId}">编辑</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
