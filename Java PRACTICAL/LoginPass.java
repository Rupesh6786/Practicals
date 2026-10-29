import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginPass implements ActionListener{
    JFrame f;
    Container c;
    JLabel l,l1;
    JTextField t;
    JButton b;
    JPasswordField pas;
    LoginPass(){
        f=new JFrame("Login and Password Page");
        c=f.getContentPane();
        c.setLayout(null);
        l=new JLabel("Username=");
        l1 =new JLabel("Password=");
        l.setBounds(10,50,100,20);
        l1.setBounds(10,100,100,20);
        t=new JTextField(20);
        t.setBounds(100, 50, 120, 20);
        pas=new JPasswordField();
        pas.setBounds(100, 100, 120, 20);
        b=new JButton("Login");
        b.setBounds(100, 150, 70, 20);
        c.add(b);
        c.add(t);
        c.add(l);
        c.add(l1);
        c.add(pas);
        b.addActionListener(this);
        f.setVisible(true);
        f.setSize(600,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPermformed(ActionEvent e){
        String user= t.getText();
        //String pass=pas.getText();
        System.out.println("Username="+t.getText());
        System.out.println("Password="+pas.getText());
        if(user.equals("gulam")){// && pass.equals("12345678")){
            System.out.println("Authentication successful");
        }
        else{
            System.out.println("Authentication Faild");
        }

    }
    public static void main(String[] args) {
        new LoginPass();
    }
    
}
