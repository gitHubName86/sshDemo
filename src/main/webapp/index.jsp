<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>sshDemo</title>
</head>
<body>
    用户列表页!<br/>
<table>
    <s:iterator value="listUser" var="thread">
        <tr>
            <td width="5%">+_+</td>
            <th style="width:35%">用户编码</th>
            <td style="width:15%">用户姓名</td>
            <th style="width:10%">性别</th>
            <td style="width:20%">电话</td>
            <td style="width:15%">邮箱</td>
        </tr>
        <tr>
            <td>❤</td>
            <th><s:property value="#thread.uid"/></th>
            <th><s:property value="#thread.name"/></th>
            <th><s:property value="#thread.sex"/></th>
            <th><s:property value="#thread.telphone"/></th>
            <th><s:property value="#thread.mail"/></th>
        </tr>
    </s:iterator>
</table>
</body>
</html>