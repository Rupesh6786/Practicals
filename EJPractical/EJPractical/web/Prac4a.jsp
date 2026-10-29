<%-- 
    Document   : Prac4a
    Created on : 16-Aug-2024, 5:23:50 pm
    Author     : prem vishwakarma
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Intrinsic Objects Example</title>
</head>
<body>
    <h1>Intrinsic Objects in JSP</h1>

    <h2>Request Object</h2>
    <p>Request HttpServlet Mapping: <%= request.getHttpServletMapping() %></p>
    <p>Request Context Path: <%= request.getContextPath() %></p>
    <p>Request Header Names: <%= request.getHeaderNames() %></p>

    <h2>Response Object</h2>
    <p>Response Content Type: <%= response.getContentType() %></p>
    <p>Response Locals: <%= response.getLocale()  %></p>
    <p>Response Character Encoding: <%= response.getCharacterEncoding() %></p>

    <h2>Session Object</h2>
    <p>Session Id: <%= session.getId() %></p>
    <p>Session Creation Time: <%= new java.util.Date(session.getCreationTime())  %></p>
    <p>Session Last Accessed Time: <%= new java.util.Date(session.getLastAccessedTime()) %></p>

</body>
</html>