import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionDemo extends JFrame implements ActionListener {
    JFrame f;
    JComboBox j;

    SelectionDemo() {
        f = new JFrame("Action Event Perform...");
        String[] items = { "Apple", "Banana", "Orange" };
        j = new JComboBox<>(items);
        JPanel p = new JPanel();
        p.add(j);
        f.add(p);
        j.addActionListener(this);
        f.setVisible(true);
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent a) {
        String s = (String) j.getSelectedItem();
        JOptionPane.showMessageDialog(f, "Selected:" + s);
    }

    public static void main(String[] args) {
        new SelectionDemo();
    }

}
