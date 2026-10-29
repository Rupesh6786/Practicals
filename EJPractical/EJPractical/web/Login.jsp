<%-- 
    Document   : Login
    Created on : 16-Aug-2024, 9:29:35 pm
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form method="post">
            <center>
            <h1>Login Page</h1>
            Username: <input type="text" name="uname" placeholder="Enter your username"><br/><br/>
            Password: <input type="password" name="upass" placeholder="Enter your password"><br/><br/>
            <input type="submit" value="login">
            </center>
        </form>
        <%
            String name = request.getParameter("uname");
            String pass = request.getParameter("upass");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals", "root", "root");
                PreparedStatement ps = con.prepareStatement("select*from userdetails where username=? and password=?");
                ps.setString(1,name);
                ps.setString(2,pass);
                ResultSet rs = ps.executeQuery();
                int c = 0;
                while(rs.next()){
                    c=1;
                }
                if(c==1){
                    out.print("<center><br><h3>Welcome "+name+"</h3></center>");
                }
                else{
                    out.print("<center><br><h3><a href='Regpage.jsp'>Registration</a></h3></center>");
                }
                rs.close();
                ps.close();
                con.close();
            } 
            catch(Exception e){
                out.print("Database not connected: "+e);
            }
        %>

    </body>
</html>
