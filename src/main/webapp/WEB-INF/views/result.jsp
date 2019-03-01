<%--<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>
<%
    String a = request.getParameter("name");
    System.out.println(a);
%>
<table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
    </tr>
</table>
</body>
</html>
