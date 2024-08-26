import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

public class CheckboxRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox and RadioButton Example");
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox("Check me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
