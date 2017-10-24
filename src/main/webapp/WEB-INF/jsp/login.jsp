<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/doLogin" method="post">
    <h2 align="center">登&nbsp;&nbsp;&nbsp;&nbsp;录</h2>
    用户名： <input type="text" id="email" name="email"/><br/>
    密码：<input type="password" name="pswd" id="pswd"/><br/>
    <input type="submit" value="登录" />
       ${errorMsg} 
    </form>


</body>
</html>
