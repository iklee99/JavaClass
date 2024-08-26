import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");

        JToolBar toolBar = new JToolBar();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Action listener for Button 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 1 was clicked!");
            }
        });

        // Action listener for Button 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 2 was clicked!");
            }
        });

        toolBar.add(button1);
        toolBar.add(button2);

        frame.add(toolBar, "North");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

