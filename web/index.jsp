<%--
  Created by IntelliJ IDEA.
  User: qqqq
  Date: 29.05.2020
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<!-- header -->
<div>
    <h1>Super app!</h1>
    Hello World
    <div>
        <div>
            <table border="0">
                <tr>
                    <form method="post" action="${pageContext.request.contextPath}/byIdUser">
                        <table border="0">
                            <tr>
                                <td>
                                    ID
                                </td>
                                <td>
                                    <input type="number" size="3" name="id">
                                </td>
                                <td>
                                    <input type="submit" value="Get">
                                </td>
                            </tr>
                        </table>
                    </form>
                </tr>
                <tr>
                    <td>
                        <button onclick="location.href='${pageContext.request.contextPath}/userList'"> Account
                            List
                        </button>
                    </td>
                </tr>
                <tr>
                    <form method="get" action="${pageContext.request.contextPath}/sumAccounts">
                        <table border="0">
                            <tr>
                                <td>
                                    <input type="text" value="${sumAccounts}">
                                </td>
                                <td>
                                    <input type="submit" value="Get">
                                </td>
                            </tr>
                        </table>
                    </form>
                </tr>
                <tr>
                    <form method="get" action="${pageContext.request.contextPath}/richestAccount">
                        <table border="0">
                            <tr>
                                <td>
                                    <input type="text"
                                           value="${richestAccount.getUser().getName()} ${richestAccount.getUser().getSureName()}">
                                </td>
                                <td>
                                    <input type="submit" value="Get">
                                </td>
                            </tr>
                        </table>
                    </form>
                </tr>
            </table>
        </div>
        <!--<table border="1" cellpadding="5" cellspacing="1">-->

        <div>

        </div>
        <div>

        </div>
    </div>
</div>
</body>
</html>
