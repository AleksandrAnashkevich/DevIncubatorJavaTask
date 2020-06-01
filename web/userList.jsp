<%--
  Created by IntelliJ IDEA.
  User: qqqq
  Date: 31.05.2020
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="org.bank.list.model.Account" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <div>
        <b1>Account List</b1>
    </div>
    <table border="1" cellpadding="5" cellspacing="1" >
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Account</th>
            <th>UserId</th>
        </tr>
        <c:forEach items="${accountList}" var="account">
            <tr>
                <th>${account.getAccountId()}</th>
                <th>${account.getUser().getName()}</th>
                <th>${account.getUser().getSureName()}</th>
                <th>${account.getAccount()}</th>
                <th>${account.getUserId()}</th>
            </tr>
        </c:forEach>

    </table>
    <div>
        <button onclick="location.href='${pageContext.request.contextPath}/'">Back</button>
    </div>
</div>

</body>
</html>
