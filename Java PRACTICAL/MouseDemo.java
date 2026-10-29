import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class MouseDemo implements MouseListener,MouseMotionListener {
    JFrame f;
    JTextField t;
    MouseDemo(){
       JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        f=new JFrame();
        f.setTitle("KeyEventDemo Event...");
        t=new JTextField(15);
        t.addMouseListener(this);
        t.addMouseMotionListener(this);
        p.add(t);
        f.add(p);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mousePressed(MouseEvent m){
        System.out.println("Mouse was Pressed");
    }
    public void mouseReleased(MouseEvent m){
        System.out.println("Mouse was Released");
    }
    public void mouseEntered(MouseEvent m){
        System.out.println("Mouse was Entered");
    }
    public void mouseExited(MouseEvent m){
        System.out.println("Mouse was Exited");
    }
    public void mouseDragged(MouseEvent m){
        System.out.println("Mouse was Dragged");
    }
    public void mouseMoved(MouseEvent m){
        System.out.println("Mouse was Moved");
    }
    public void mouseClicked(MouseEvent m){
        System.out.println("Mouse was Click");
    }
    public static void main(String[] args) {
        new MouseDemo();
    }
    
}
