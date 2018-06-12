<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<body>
<h2>登录</h2>
<form action="<%=basePath %>login/login.shtml" method="post">
    <p>用户名：<input type="text" name="username"></p>
    <p>密&nbsp;码<input type="password" name="password"></p>
    <p><input type="submit" value="提交"></p>
</form>
</body>
</html>
