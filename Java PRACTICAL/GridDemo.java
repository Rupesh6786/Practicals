import javax.swing.*;
import java.awt.*;
public class GridDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Gried Layout Example");
        JPanel p=new JPanel(new GridLayout(2,3));
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        JButton b4=new JButton("Button4");
        JButton b5=new JButton("Button5");
        JButton b6=new JButton("Button6");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        f.add(p);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

