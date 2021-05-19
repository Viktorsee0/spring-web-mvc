<%--
  Created by IntelliJ IDEA.
  User: itsmymac
  Date: 18.05.21
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container container d-flex justify-content-center">
    <div class="col-3">
        <ul class="list-group">
            <jsp:useBean id="operationList" scope="request" type="java.util.List"/>
            <c:forEach items="${operationList}" var="opertion">
                <li class="list-group-item list-group-item-light">
                        ${opertion.FNum}
                        ${opertion.operation}
                        ${opertion.SNum}
                            =
                        ${opertion.result}
                </li>
            </c:forEach>
        </ul>
    </div>
</div>

</body>
</html>
