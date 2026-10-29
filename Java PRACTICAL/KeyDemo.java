import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyDemo implements KeyListener{
    JFrame f;
    JTextField t;
    KeyDemo(){
       JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        f=new JFrame();
        f.setTitle("KeyEventDemo Event...");
        t=new JTextField(15);
        t.addKeyListener(this);
        p.add(t);
        f.add(p);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyTyped(KeyEvent k){
        t.setText("Key Typed "+k.getKeyChar());
        System.out.println("Key Typed");
    }
    public void keyPressed(KeyEvent k){
       t.setText("Key Pressed");
       System.out.println("Key Pressed");
    }
    public void keyReleased(KeyEvent k){
        t.setText("Key Released");
        System.out.println("Key Released");
    }

    public static void main(String[] args) {
        new KeyDemo();
    }
}
