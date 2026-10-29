import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class FocusDemo implements FocusListener{
    JFrame f;
    JTextField t;
    JLabel l;
    FocusDemo(){
       JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        f=new JFrame();
        f.setTitle("FocusDemo Event...");
        t=new JTextField(15);
        l=new JLabel(" ");
        JButton b=new JButton("Ok");
        t.addFocusListener(this);
        p.add(t);
        p.add(b);
        p.add(l);
        f.add(p);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void focusGained(FocusEvent e){
        l.setText("Focus Gained");
        System.out.println("Focus Gained");
    }
    public void focusLost(FocusEvent e){
        l.setText("Focus Lost");
        System.out.println("Focus Lost");
    }
    public static void main(String[] args) {
        new FocusDemo();
    }
    
}
