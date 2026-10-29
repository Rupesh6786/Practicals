import javax.swing.*;
import java.awt.*;
public class FlowDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Flow Layout Example");
        JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
