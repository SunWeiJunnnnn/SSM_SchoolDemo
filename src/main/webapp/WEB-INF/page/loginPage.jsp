<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>欢迎</title>
    <meta charset="UTF-8">

    <script src="${pageContext.request.contextPath}/content/js/jquery-1.11.3.js"></script>
    <%--bootstrap--%>
    <script src="<c:url value="/content/bootstrap/js/bootstrap.min.js"/>"></script>
    <script src="${pageContext.request.contextPath}/content/js/loginPage.js" type="text/javascript"></script>
    <link href="${pageContext.request.contextPath}/content/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row  center-block">
            <div class="col-md-12 center-block">
                <h1 class="text-center">Carl's Blog</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form id="loginForm" >
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="username" class="form-control" id="username" placeholder="Username" name="username">
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" placeholder="Password" name="password">
                    </div>
                    <button type="button" class="btn btn-primary" id="loginBtn">Submit</button>
                    <button type="button" class="btn btn-info" id="signup" href="/signup">SignUp</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
