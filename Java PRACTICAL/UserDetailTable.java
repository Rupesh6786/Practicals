import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class UserDetailTable extends JFrame {

    private JTable table;

    public UserDetailTable() {
        setTitle("User Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a table model
        DefaultTableModel model = new DefaultTableModel();
        table = new JTable(model);

        // Add columns to the table model
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Age");

        // Connect to the database and retrieve data
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Change this if you're using a different database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root"); // Update with your database URL, username, and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM userDetails");

            // Add rows to the table model
            while (rs.next()) {
                Object[] row = {rs.getInt("id"), rs.getString("name"), rs.getInt("age")};
                model.addRow(row);
            }

            // Close the connections
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }

        // Add the table to a scroll pane and add it to the frame
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserDetailTable frame = new UserDetailTable();
            frame.setVisible(true);
        });
    }
}
