import javax.swing.*;
import java.awt.*;
public class MenuBar {
    JFrame f;
    MenuBar(){
        f=new JFrame("MenuBar");
        JPanel p=new JPanel(new FlowLayout());
        JMenuBar m=new JMenuBar();
        JMenu m1=new JMenu("Language");
        JMenu m2=new JMenu("Create");
        JMenuItem i=new JMenuItem("Java");
        JMenuItem i1=new JMenuItem("James");
        m.add(m1);
        m.add(m2);
        m1.add(i);
        m2.add(i1);
        p.add(m);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MenuBar();
    }
    
}
