import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class LabelTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label and TextField Example");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(20);

        frame.add(label);
        frame.add(textField);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
