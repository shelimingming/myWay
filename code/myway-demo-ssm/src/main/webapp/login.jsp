<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <base href="<%=basePath %>">
    <title>登录</title>

    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/my/login.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="signin">
<div class="signinpanel">
    <div class="col-sm-7">
        <div class="signin-info">
            <div class="logopanel m-b">
                <h1>MyWay</h1>
            </div>
            <div class="m-b"></div>
            <h3>
                欢迎使用 <strong>MyWay管理系统</strong>
            </h3>
            <ul class="m-b">
                <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i>
                    springBoot
                </li>
                <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> mybatis</li>
                <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> shiro</li>
                <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i>
                    thymeleaf
                </li>
                <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i>
                    bootstrap
                </li>
            </ul>
        </div>
    </div>
    <div class="col-sm-5">
        <form id="signupForm" class="navbar-form navbar-left" action="<%=basePath %>login/login.shtml" method="post">
            <h3 class="text-center">用户登录</h3>
            <div class="form-group">
                <input type="text" class="form-control" name="username" placeholder="username">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="password">
            </div>
            <div class="form-group">
                <input type="submit" value="提交" class="btn btn-default" />
            </div>
        </form>
    </div>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="resources/js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
