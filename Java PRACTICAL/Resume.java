import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Resume{
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField qualificationField;
    private JTextField skillsField;
   private JCheckBox experienceCheckBox;
    private JButton saveButton;

    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/emp1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public Resume() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationField = new JTextField();
        JLabel skillsLabel = new JLabel("Skills:");
        skillsField = new JTextField();
        JLabel experienceLabel = new JLabel("Experience/Fresher:");
        experienceCheckBox = new JCheckBox();
        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveResume();
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(qualificationLabel);
        panel.add(qualificationField);
        panel.add(skillsLabel);
        panel.add(skillsField);
        panel.add(experienceLabel);
        panel.add(experienceCheckBox);
        panel.add(saveButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void saveResume() {
        String name = nameField.getText();
        String email = emailField.getText();
        String qualification = qualificationField.getText();
        String skills = skillsField.getText();
       boolean experience = experienceCheckBox.isSelected();

        // Save data to the database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO resume2 (name, email, qualification, skills, experience) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, qualification);
            statement.setString(4, skills);
           statement.setBoolean(5, experience);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Resume saved successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error saving resume: " + ex.getMessage());
        }

        // Generate PDF using iTextPDF
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("resume.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(2);
            table.addCell("Name:");
            table.addCell(name);
            table.addCell("Email:");
            table.addCell(email);
            table.addCell("Qualification:");
            table.addCell(qualification);
            table.addCell("Skills:");
            table.addCell(skills);
            table.addCell("Experience/Fresher:");
            table.addCell(experience ? "Experience" : "Fresher");

            document.add(table);
            document.close();

            JOptionPane.showMessageDialog(frame, "PDF generated successfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error generating PDF: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Resume();
            }
        });
    }
}

