import java.sql.*;
public class RetriveData {
    public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
            PreparedStatement ps=con.prepareStatement("select * from emp1");//retrive data
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println("emp_no:"+rs.getInt("emp_no"));
                System.out.println("Name:"+rs.getString("emp_name"));
                System.out.println("Salary:"+rs.getDouble("emp_salary"));
                System.out.println("-------------------------------------------");
                
            }
            con.close();
        
        }  
    
}

