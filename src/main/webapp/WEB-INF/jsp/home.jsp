<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这里是首页(jsp页面)
    <shiro:user>
        欢迎[<shiro:principal/>]登录，<a href="/toLogin">退出</a>
    </shiro:user>
    <shiro:authenticated>
        用户[<shiro:principal/>]已身份验证通过
    </shiro:authenticated>

    <shiro:hasRole name="系统管理员">
        用户[<shiro:principal/>]拥有角色系统管理员<br/>
    </shiro:hasRole>
</body>
</html>
