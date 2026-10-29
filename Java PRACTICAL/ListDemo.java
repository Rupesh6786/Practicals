import javax.swing.*;
import java.awt.*;
public class ListDemo {
    JFrame f;
    ListDemo(){
        JList l;
        f=new JFrame("JList..");
        JPanel p=new JPanel(new FlowLayout());
        String city[]={"Mumbai","Pune","Nashik","Aurangabad"};
        l=new JList<>(city);
        l.setSelectionMode(JList.WIDTH);
       // JCheckBox j=new JCheckBox("java");
       // p.add(j);
        p.add(l);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ListDemo();
    }
    
}

