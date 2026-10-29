import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionDemo extends JFrame implements ActionListener {
    JFrame f;
    ActionDemo(){
        f=new JFrame("Action Event Perform...");
        Container c=f.getContentPane();
        JButton b=new JButton("Click Me...");
        c.add(b,BorderLayout.CENTER);
        b.addActionListener(this);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }
    public void actionPerformed(ActionEvent a){
        JOptionPane.showMessageDialog(f, "Button Clicked");
    }
    public static void main(String[] args) {
        new ActionDemo();
    }
    
}
