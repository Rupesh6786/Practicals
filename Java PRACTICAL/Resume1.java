// ++ imporing swing library
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
// import sql library
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// itextpdf library
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Resume1 {

    // Declare Variable
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField college;
    private JTextField dateBirth;
    private JTextField national;
    private JTextField degree;
    private JTextField experience;
    private JTextArea addressArea;
    private JTextField ssc;
    private  JTextField hsc;
    private  JTextField sem1;
    private  JTextField sem2;
    private  JTextField sem3;
    private JTextField contactField;
    private JButton selectImageButton;
    private JLabel imageLabel;
    private JTextField location;
    private JButton saveButton;
    private JTextField skills1;
    private JTextField skills2;
    private JTextField skills3;
    private JTextField skills4;
    private JTextField english;
    private JTextField hindi;




    private String imagePath=null ;

    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/resume";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public Resume1() { //constructor
        initialize();//function
    }
    private void initialize() {
        frame = new JFrame();       //interface setup
        frame.setTitle("Resume Builder");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setContentPane(panel);
        //frame.pack();

         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout(FlowLayout.CENTER));
       // panel.setLayout(new GridLayout(16, 2));

        JLabel nameLabel = new JLabel("FullName:");
        nameField = new JTextField(15);
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);
        JLabel Dob=new JLabel("Date of Birth");
        dateBirth=new JTextField(10);
        JLabel na=new JLabel("Nationalty");
        national=new JTextField(10);
        JLabel aboutLabel = new JLabel("Address:");
        addressArea = new JTextArea(2,15);
        JLabel qualificationLabel = new JLabel("Qualification:");
       // qualificationLabel.setBounds(10, 20, 100, 50);
        JLabel College = new JLabel("CollegeName:");
        college = new JTextField(17);
        JLabel Degree = new JLabel("Degree:");
        degree=new JTextField(17);
        JLabel Ssc = new JLabel("SSC:");
        ssc=new JTextField(10);
        JLabel Hsc = new JLabel("HSC:");
        hsc=new JTextField(10);
        JLabel Sem1 = new JLabel("SEM1:");
        sem1=new JTextField(10);
        JLabel Sem2 = new JLabel("SEM2:");
        sem2=new JTextField(10);
        JLabel Sem3 = new JLabel("SEM3:");
        sem3=new JTextField(10);
       JLabel skill = new JLabel("Skills:");
        skills1 = new JTextField(12);
        skills2 = new JTextField(12);
        skills3 = new JTextField(12);
        skills4 = new JTextField(12);
        JLabel lan=new JLabel("Language");
        english=new JTextField(17);
        hindi =new JTextField(17);
        JLabel experienceLabel = new JLabel("Experience/Fresher:");
        experience = new JTextField(15);
        JLabel contactLabel = new JLabel("Contact:");
        contactField = new JTextField(10);
        selectImageButton = new JButton("Select Image");
        location =new JTextField(12);
        imageLabel = new JLabel();
        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveResume();
            }
        });

        
        selectImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectImage();
            }
        });
         //adding panel in frame
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(contactLabel);
        panel.add(contactField);
        panel.add(Dob);
        panel.add(dateBirth);
        panel.add(na);
        panel.add(national);
        panel.add(aboutLabel);
        panel.add(addressArea);
        panel.add(qualificationLabel);
        panel.add(College);
        panel.add(college);
        panel.add(Degree);
        panel.add(degree);
        panel.add(Ssc);
        panel.add(ssc);
        panel.add(Hsc);
        panel.add(hsc);
        panel.add(Sem1);
        panel.add(sem1);
        panel.add(Sem2);
        panel.add(sem2);
        panel.add(Sem3);
        panel.add(sem3);
        panel.add(lan);
        panel.add(english);
        panel.add(hindi);
        panel.add(skill);
        panel.add(skills1);
        panel.add(skills2);
        panel.add(skills3);
        panel.add(skills4);
        panel.add(experienceLabel);
        panel.add(experience);
        panel.add(selectImageButton);
        panel.add(location);
        panel.add(imageLabel);
        panel.add(saveButton);
        panel.setBackground(Color.CYAN);
       // frame.getContentPane().setBackground(Color.BLUE);

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
            location.setText(selectedFile.getAbsolutePath());
           // imageLabel.setIcon(resize(location.getText()));
            //imagePath = selectedFile.getAbsolutePath();
           ImageIcon icon = new ImageIcon(imagePath);
            imageLabel.setIcon(icon);
        }
    }

    private void saveResume() {
        String name = nameField.getText();
         String email = emailField.getText();
         String contact = contactField.getText();
         String date = dateBirth.getText();
         String nat = national.getText();
         String address = addressArea.getText();
         String cge = college.getText();
         String deg = degree.getText();
         String ss = ssc.getText();
         String hs = hsc.getText();
         String se1 = sem1.getText();
         String se2 = sem1.getText();
         String se3 = sem1.getText();
         String skil1 = skills1.getText();
         String skil2 = skills2.getText();
         String skil3 = skills3.getText();
         String skil4 = skills4.getText();
         String exp = experience.getText();
         String lan1 = hindi.getText();
         String lan2 = english.getText();
        

        // Save data to the database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql1 = "INSERT INTO personal(name, email, contact,date,national,address) VALUES (?, ?, ?, ?, ?, ?)";
            String sql2="INSERT INTO qualification(college,degree,ssc,hsc,sem1,sem2,sem3) VALUES (?, ?, ?, ?, ?, ?, ?)";
            String sql3="INSERT INTO skillang(skill1,skill2,skill3,skill4,experiance,lang1,lang2) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
            PreparedStatement statement = connection.prepareStatement(sql1);
            PreparedStatement statement1 = connection.prepareStatement(sql2);
            PreparedStatement statement2 = connection.prepareStatement(sql3);
            statement.setString(1, name); //sql1
            statement.setString(2, email);
            statement.setString(3, contact);
            statement.setString(4, date);
            statement.setString(5, nat);
            statement.setString(6, address);
            statement1.setString(1, cge);  //sql2
            statement1.setString(2, deg);
            statement1.setString(3, ss);
            statement1.setString(4, hs);
            statement1.setString(5, se1);
            statement1.setString(6, se2);
            statement1.setString(7, se3);
            statement2.setString(1, skil1); //sql3
            statement2.setString(2, skil2);
            statement2.setString(3, skil3);
            statement2.setString(4, skil4);
            statement2.setString(5, exp);
            statement2.setString(6, lan1);
            statement2.setString(7, lan2);
            statement.executeUpdate();  //sql1
            statement1.executeUpdate();  //sql2
            statement2.executeUpdate(); //sql3
            JOptionPane.showMessageDialog(frame, "Resume saved successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error saving resume: " + ex.getMessage());
        }

        // Generate PDF using iTextPDF

try {
   
Document myDocument = new Document();
//PdfWriter.getInstance(myDocument, new FileOutputStream(nameOfFile));
  PdfWriter.getInstance(myDocument, new FileOutputStream("resume.pdf"));
myDocument.open();
PdfPTable table = new PdfPTable(2);
com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(location.getText());
image.setAbsolutePosition(473f, 750f);
image.scaleAbsolute(80f,70f);
myDocument.add(image);
//myDocument.add(img);
//com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(imagePath);
//myDocument.add(image);
myDocument.add(new Paragraph(nameField.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,32, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("CONTACT DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,12, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(emailField.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(contactField.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(dateBirth.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(national.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY )));
//myDocument.add(new Paragraph(addressArea.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7, BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(addressArea.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("PROGRAMMING SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,12, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY)));
table.addCell(skills1.getText());
table.addCell(skills2.getText());
table.addCell(skills3.getText());
table.addCell(skills4.getText());
myDocument.add(table);
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("ACADEMIC QUALIFICATIONS", FontFactory.getFont(FontFactory.TIMES_BOLD,12, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("College/Univarsity : "+college.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("Degree : "+degree.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("SSC Result : "+ssc.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("HSC Result : "+hsc.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("Sem1 Result : "+sem1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("Sem2 Result : "+sem2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("Sem3 Result : "+sem3.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
//myDocument.add(new Paragraph(degree.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));


//myDocument.add(new Paragraph(qualiB.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("WORK EXPERIENCE",FontFactory.getFont(FontFactory.TIMES_BOLD,12, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(experience.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("LANGUAGES",FontFactory.getFont(FontFactory.TIMES_BOLD,12, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph(english.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(hindi.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY )));
myDocument.close();
         
        JOptionPane.showMessageDialog(frame, "PDF generated successfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error generating PDF: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Resume1();
            }
        });
    }
}
