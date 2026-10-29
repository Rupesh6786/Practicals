import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            // String name="khalid";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the emp number:");
            int no = sc.nextInt();
            System.out.println("Enter a emp name:");
            String name1 = sc.next();
            System.out.println("Enter a emp salary:");
            double salary = sc.nextDouble();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
            // PreparedStatement ps = con.prepareStatement("insert into emp1
            // values(104,'"+name+"',5000)");
            // PreparedStatement ps = con.prepareStatement("insert into emp1
            // values(103,'hasim',5000)");
            PreparedStatement ps = con.prepareStatement("insert into emp1 values(?,?,?)");
            ps.setInt(1, no);
            ps.setString(2, name1);
            ps.setDouble(3, salary);
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Falied");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
