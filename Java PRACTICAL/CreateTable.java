import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception{
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
    String q="create table table1(Tid int(20) primary key auto_increment,tname varchar(30));";
    Statement sc=con.createStatement();
    sc.executeUpdate(q);
    System.out.println("Table Created in database..");

    con.close();
}
}
