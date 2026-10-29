import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class ColorChange implements ActionListener {
    JFrame f;
    JPanel p;
    JButton b;
    ColorChange(){
        f=new JFrame("Button Event");
        p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        b=new JButton("Click here to change color");
        p.add(b);
        f.add(p);
        b.addActionListener(this);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Random r=new Random();
        Color c=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        p.setBackground(c);
    }
    public static void main(String[] args) {
        new ColorChange();
    }
    
}
