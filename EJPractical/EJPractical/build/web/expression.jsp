<%-- 
    Document   : expression
    Created on : 03-Sep-2024, 8:25:05 am
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>expression</title>
    </head>
    <body>
        <h1>Expression Page</h1>
        Welcome, ${param.user}<br>
        Session value is ${sessionScope.username}<br>
        Cookie value is ${cookie.c_name.value}
    </body>
</html>
