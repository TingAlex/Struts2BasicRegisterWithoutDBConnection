<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/10
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login.jsp</title>
</head>
<body>

<form name="form1" action="loginAction">
    用户名：<input type="text" name="username"><br>
    密  码：<input type="password" name="password"><br>
    <%--这部分是域对象字段驱动方式--%>
    <%--用户名：<input type="text" name="user.username"><br>
    密  码：<input type="password" name="user.password"><br>--%>
    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
    <input type="button" value="注册" onclick="window.location.href
='registerAction'">
</form>
</body>
</html>
