<%-- 
    Document   : Prac4b
    Created on : 16-Aug-2024, 5:56:47 pm
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" scope="request" class="p1.UserBeans">
            <jsp:setProperty name="obj" property="*" />
        </jsp:useBean>
        
        <%if(obj.validate()){%>
        <jsp:forward page="success.jsp"/>
        <% }else{ %>
        <jsp:include page="main.html"/>
        <%}%>
        <center>
        <h4 color="red">Error: <%= obj.getError()%></h4>
        </center>
    </body>
</html>
