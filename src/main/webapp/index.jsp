<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>sshDemo</title>
    <style>
        table,tr,th,td {
            border: 1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
    用户列表页!<br/>
<table >
    <s:iterator value="#request.listUser" var="thread">
        <tr>
            <th width="5%">+_+</th>
            <th style="width:10%">用户编码</th>
            <th style="width:20%">用户姓名</th>
            <th style="width:10%">性别</th>
            <th style="width:20%">电话</th>
            <th style="width:35%">邮箱</th>
        </tr>
        <tr>
            <td>❤</td>
            <td><s:property value="#thread.uid"/></td>
            <td><s:property value="#thread.name"/></td>
<%--            <td><s:property value="#thread.sex"/></td>--%>
            <td><s:if  test="#thread.sex == 1">男</s:if>
                <s:else>女</s:else></td>
            <td><s:property value="#thread.telphone"/></td>
            <td><s:property value="#thread.mail"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>