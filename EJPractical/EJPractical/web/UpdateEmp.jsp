<%-- 
    Document   : UpdateEmp
    Created on : 20-Sep-2024, 9:20:49 pm
    Author     : prem vishwakarma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Employee</title>
    </head>
    <body>
        <%
            String no = request.getParameter("eno");
            String ename = request.getParameter("ename");
            String age = request.getParameter("eage");
            String edesg = request.getParameter("edesg");
            String salary = request.getParameter("esalary");
            int eno = Integer.parseInt(no);
            int eage = Integer.parseInt(age);
            int esalary = Integer.parseInt(salary);
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals","root","root");
                PreparedStatement ps = con.prepareStatement("select*from empdetails where eno=?");
                ps.setInt(1,eno);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    PreparedStatement ps1 = con.prepareStatement("update empdetails set ename=?, age=?, desg=?, salary=? where eno=?");
                    ps1.setString(1,ename);
                    ps1.setInt(2,eage);
                    ps1.setString(3,edesg);
                    ps1.setInt(4,esalary);
                    ps1.setInt(5,eno);
                    ps1.executeUpdate();
                    ps1.close();
                    out.println("<b>Eno: "+eno+" <b><br> Updated values are..<br> Employee name: "+ename+" Age: "+eage+" Desg: "+edesg+" Salary: "+esalary);
                }
                else
                {
                    PreparedStatement ps2 = con.prepareStatement("insert into empdetails values(?,?,?,?,?)");
                    ps2.setInt(1,eno);
                    ps2.setString(2,ename);
                    ps2.setInt(3,eage);
                    ps2.setString(4,edesg);
                    ps2.setInt(5,esalary);
                    ps2.executeUpdate();
                    ps2.close();
                    out.println("<b>Employee details stored succesfully.</b>");
                }
                ps.close();
                rs.close();
                con.close();
                
            }catch(Exception e){
                out.print("<h2>Error:"+e+"</h2>");
            }
        %>
    </body>
</html>
