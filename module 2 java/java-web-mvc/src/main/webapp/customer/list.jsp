<%--
  Created by IntelliJ IDEA.
  User: m4600nvidia
  Date: 11/26/2020
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customers?action = create">Create new customer</a>
</p>
<table border="=1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${customers}' var="customer">
    <tr>
        <td><a href="/customer?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td>
        <td><a href="/customer?action=edit&id=${customer.getId()}">Edit</a></td>
        <td><a href="/customer?action=delete&id=${customer.getId()}">Delete</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
