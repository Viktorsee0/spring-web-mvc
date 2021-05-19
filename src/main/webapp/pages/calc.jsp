<%--
  Created by IntelliJ IDEA.
  User: itsmymac
  Date: 18.05.21
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container container d-flex justify-content-center">
    <div class="col-6 d-flex flex-column">
        <form action="/calc" method="post">
            <div class="mb-3">
                <label for="fNum" class="form-label">First number</label>
                <input type="text" name="fNum" class="form-control" id="fNum">
            </div>
            <div class="mb-3">
                <label for="sNum" class="form-label">Secont number</label>
                <input type="text" name="sNum" class="form-control" id="sNum">
            </div>
            <select name="operation" class="form-select" aria-label="Default select example">
                <option value="sum">sum</option>
                <option value="sub">sub</option>
                <option value="mul">mul</option>
                <option value="div">div</option>
            </select>
            <button class="btn btn-primary mt-3">Submit</button>
        </form>
        <div>
            <p>Result: ${operation.result}</p>
        </div>
    </div>
</div>

</body>
</html>
