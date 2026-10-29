import java.sql.*;
public class Updateemp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
            //PreparedStatement ps=con.prepareStatement("update emp1 set emp_name=? where emp_no=?");
            PreparedStatement ps=con.prepareStatement("delete from emp1 where emp_no=?");
            //ps.setString(1, "rehan");
            //ps.setInt(2,105);
            ps.setInt(1, 106); //delect row
            int count=ps.executeUpdate();
            if(count>0){
               // System.out.println("Update Successfully");
                System.out.println("Deletion Successfully");
            }
            else{
               // System.out.println("Update failed");s
                System.out.println("Deletion Failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
