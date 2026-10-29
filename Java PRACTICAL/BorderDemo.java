import javax.swing.*;
import java.awt.*;
public class BorderDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Border Layout Example");
        Container c=f.getContentPane();
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        JButton b4=new JButton("Button4");
        JButton b5=new JButton("Button5");
        c.add(b1,BorderLayout.SOUTH);
        c.add(b2,BorderLayout.NORTH);
        c.add(b3,BorderLayout.CENTER);
        c.add(b4,BorderLayout.EAST);
        c.add(b5,BorderLayout.WEST);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
