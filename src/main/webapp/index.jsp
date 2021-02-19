<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Demo</title>
</head>
<body>
<h3><%= "New to JAVA ?... Enter your credentials !!!" %>
</h3>
<br/>
<form action="hello-servlet" method="get">
    <label> Name </label>
    <input type required="text" name="username"/><br/><br/>
    <label>Password</label>
    <input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>
</body>
</html>