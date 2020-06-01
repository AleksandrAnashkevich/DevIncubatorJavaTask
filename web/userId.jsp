<%--
  Created by IntelliJ IDEA.
  User: qqqq
  Date: 30.05.2020
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:if test="${empty account}">
        <p style="color: #ff0000;">Not Found</p>
    </c:if>

    <c:if test="${not empty account}">
    <table border="1" cellpadding="5" cellspacing="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Account</th>
            <th>UserId</th>
        </tr>
        <tr>
            <th>${account.getAccountId()}</th>
            <th>${account.getUser().getName()}</th>
            <th>${account.getUser().getSureName()}</th>
            <th>${account.getAccount()}</th>
            <th>${account.getUserId()}</th>
        </tr>
    </table>
    </c:if>
    <div>
        <button onclick="location.href='${pageContext.request.contextPath}/'">Back</button>
    </div>
</body>
</html>
