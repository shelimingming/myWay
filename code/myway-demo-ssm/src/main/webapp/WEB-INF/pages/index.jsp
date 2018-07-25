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
    <title>主页</title>

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

<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
                <li class="active">
                    <a href="#">
                        <i class="glyphicon glyphicon-th-large"></i>
                        首页
                    </a>
                </li>
                <li>
                    <a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse">
                        <i class="glyphicon glyphicon-cog"></i>
                        系统管理
                        <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                    </a>
                    <ul id="systemSetting" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="mytask"><i class="glyphicon glyphicon-user"></i>用户管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>菜单管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>角色管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-edit"></i>修改密码</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-eye-open"></i>日志查看</a></li>
                    </ul>
                </li>
                <li>
                    <a href="./plans.html">
                        <i class="glyphicon glyphicon-credit-card"></i>
                        物料管理
                    </a>
                </li>
                <li>
                    <a href="./grid.html">
                        <i class="glyphicon glyphicon-globe"></i>
                        分发配置
                        <span class="label label-warning pull-right">5</span>
                    </a>
                </li>
                <li>
                    <a href="./charts.html">
                        <i class="glyphicon glyphicon-calendar"></i>
                        图表统计
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-fire"></i>
                        关于系统
                    </a>
                </li>
            </ul>
        </div>
        @*
        <div class="col-md-10">
            主窗口
        </div>
        *@
    </div>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="resources/js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
