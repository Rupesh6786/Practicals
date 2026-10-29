import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentDatabaseManager extends JFrame {
    private JTextField nameField, rollNumberField;
    private JButton addButton, deleteButton;

    public StudentDatabaseManager() {
        nameField = new JTextField(30);
        rollNumberField = new JTextField(25);

        addButton = new JButton("Add Student");
        deleteButton = new JButton("Delete Student");

        addButton.addActionListener(e -> addStudent());
        deleteButton.addActionListener(e -> deleteStudent());

        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Roll Number:"));
        panel.add(rollNumberField);
        panel.add(addButton);
        panel.add(deleteButton);

        add(panel);

        setTitle("Student Database Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStudent() {
        String name = nameField.getText();
        String rollNumber = rollNumberField.getText();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students (name, roll_number) VALUES (?, ?)")) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, rollNumber);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student added successfully");
        } catch (SQLException e) {
            handleException(e);
        }
    }

    private void deleteStudent() {
        //StudentDatabaseManager.forName("com.mysql.cj.jdbc.Driver");

        String rollNumber = rollNumberField.getText();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM students WHERE roll_number = ?")) {
            preparedStatement.setString(1, rollNumber);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student deleted successfully");
        } catch (SQLException e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentDatabaseManager::new);
    }
}