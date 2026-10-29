<%-- 
    Document   : success
    Created on : 16-Aug-2024, 6:56:33 pm
    Author     : prem vishwakarma
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="p1.UserBeans" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h1>Form Submitted Successfully</h1>
    
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Age: <%= request.getParameter("age") %></p>
    <p>Email: <%= request.getParameter("email") %></p>
    <p>Gender: <%= request.getParameter("gender") %></p>
</body>
</html>

