<%--
  Created by IntelliJ IDEA.
  User: junan
  Date: 2018/05/26
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>注册用户</title>
    <c:import url="publicResources.jsp"/>
</head>
<body>
<div class="container">
    <div class="row"><div class="col-md-12"><h1 class="text-center">Sign Up</h1></div></div>
    <div class="row">
        <form>
            <div class="form-group">
                <label for="usernameInput">Username</label>
                <input placeholder="Username" type="text" id="username" id="usernameInput" class="form-control">
            </div>
            <div class="form-group">
                <label for="passwordInput">Password</label>
                <input class="form-control" type="password" id="passwordInput" name="password" placeholder="Password">
            </div>
            <div class="form-group">
                <label for="realName">Name</label>
                <input class="form-control" type="text" id="realName" name="name" placeholder="Name">
            </div>
            <div class="form-group">
                <label for="address">Address</label>
                <input class="form-control" type="text" id="address" name="address" placeholder="Address">
            </div>
            <div class="form-group">
                <label for="emailInput">Email </label>
                <input class="form-control" type="email" id="emailInput" name="email" placeholder="Email">
            </div>
            <div class="form-group">
                <label for="phoneInput">Phone</label>
                <input class="form-control" type="text" id="phoneInput" name="phone" placeholder="Phone">
            </div>
            <div class="form-group">
            <label for="gennderInput">Gender</label>
            <select class="form-control" name="gender" id="gennderInput">
                <option value="男">Male</option>
                <option value="女">Female</option>
            </select>
            </div>
            <button type="button">Submit</button>
            <button type="button">Cancel</button>
        </form>
    </div>
</div>
</body>
</html>
