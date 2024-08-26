import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxRadioButtonEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        JCheckBox checkBox = new JCheckBox("Check me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        // Create a ButtonGroup for radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox is " + (e.getStateChange() == ItemEvent.SELECTED ? "checked" : "unchecked"));
            }
        });

        radioButton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Option 1 selected");
                }
            }
        });

        radioButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Option 2 selected");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
