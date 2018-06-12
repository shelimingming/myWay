<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath %>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传</title>
</head>
<body>
<form action="<%=basePath %>/upload/uploadFile.shtml" method="post" enctype="multipart/form-data">
    <p>大头照：<input type="file" name="bigHeadImage"></p>
    <p><input type="submit" value="上传"></p>
</form>
<form action="<%=basePath %>/upload/mutiUploadFile.shtml" method="post" enctype="multipart/form-data">
    <p>大头照：<input type="file" name="bigHeadImage"></p>
    <p>小头照：<input type="file" name="smallHeadImage"></p>
    <p><input type="submit" value="上传"></p>
</form>
</body>
</html>