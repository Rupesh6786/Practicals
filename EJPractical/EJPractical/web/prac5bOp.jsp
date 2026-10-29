<%-- 
    Document   : prac5bOp
    Created on : 03-Sep-2024, 7:37:57 am
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operators</title>
    </head>
    <body>
        <h1>Operators</h1>
        <h3>Arithmetic operators</h3>
        <h4>Addition of 5 and 10 is ${10+5}</h4>
        <h4>Subtraction of 10 and 5 is ${10-5}</h4>
        
        <h3>Logical operators</h3>
        <h4>true and true is ${true and true}</h4>
        <h4>not of true is ${not true}</h4>
        <h4>true && false is ${true && false}</h4>
        <h4>true || false is ${true || false}</h4>
        
        <h3>Relation operators</h3>
        <h4>is 10 greater then 3 ${10>3}</h4>
        <h4>2 less then equal to 4 ${2<=4}</h4>
        <h4>10.0 is equal to 10 ${10.0==10}</h4>
        
        <h3>Empty operators</h3>
        <h4>The value of empty operator is ${empty"name"}</h4>
        
    </body>
</html>
