<%-- 
    Document   : Index
    Created on : 03-Sep-2024, 7:28:58 am
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index file</title>
    </head>
    <body>
        <h1>Index Page</h1>
        <% session.setAttribute("username","Admin"); %>
        <% 
            Cookie ck = new Cookie("c_name","Admin");
            response.addCookie(ck);
        %>
        <form action="expression.jsp">
            Enter name:<input type="text" name="user" ><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
