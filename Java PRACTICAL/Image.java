

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
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

public class Image{
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JButton selectImageButton;
    private JLabel imageLabel;
    private JButton saveButton;

    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/resumes";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    // Selected image file path
    private String selectedImagePath;

    public Image() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        selectImageButton = new JButton("Select Image");
        selectImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectImage();
            }
        });

        imageLabel = new JLabel();
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
        panel.add(selectImageButton);
        panel.add(new JLabel()); // Empty cell for alignment
        panel.add(imageLabel);
        panel.add(new JLabel()); // Empty cell for alignment
        panel.add(saveButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            selectedImagePath = selectedFile.getAbsolutePath();
            ImageIcon icon = new ImageIcon(selectedImagePath);
            imageLabel.setIcon(icon);
        }
    }

    private void saveResume() {
        String name = nameField.getText();
        String email = emailField.getText();

        // Save data to the database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO resumes (name, email, image_path) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, selectedImagePath);
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

            // Add image to PDF
            if (selectedImagePath != null) {
                com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(selectedImagePath);
                document.add(image);
            }

            // Add text to PDF
            PdfPTable table = new PdfPTable(2);
            table.addCell("Name:");
            table.addCell(name);
            table.addCell("Email:");
            table.addCell(email);
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
                new Image();
            }
        });
    }
}
