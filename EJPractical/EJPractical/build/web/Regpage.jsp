<%-- 
    Document   : Regpage
    Created on : 16-Aug-2024, 9:41:43 pm
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <center>
            <form method="post">
                <h1>Registration Page</h1>
                Username:<input type="text" name="uname" placeholder="Enter your name"><br><br>
                Password:<input type="password" name="upass" placeholder="Enter your password"><br><br>
                Re-Password:<input type="password" name="reupass" placeholder="Re enter your password"><br><br>
                Email:<input type="email" name="email" placeholder="Enter your email"><br><br>
                <input type="submit" value="register">
            </form>
        </center>
    <%
        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");
        String repass = request.getParameter("reupass");
        String email = request.getParameter("email");

        if(name != null && pass != null && repass != null && email != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals", "root", "root");
                PreparedStatement ps = con.prepareStatement("insert into userdetails values(?, ?, ?, ?)");
                ps.setString(1, name);
                ps.setString(2, pass);
                ps.setString(3, repass);
                ps.setString(4, email);
                int i = ps.executeUpdate();
                if(i == 1){
                    out.print("<center><br><h2>You have successfully registered</h2></center>");
                    out.print("<center><br><h2><a href='Login.jsp'>login</a></h2></center>");
                } else {
                    out.print("<center><br><h2>Your registration was unsuccessful</h2></center>");
                }
            } catch(Exception e) {
                out.print("Error: " + e);
            }
        } else {
           
        }
    %>
    </body>
</html>
