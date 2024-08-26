import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Event Example");
        JTextField textField = new JTextField(20);

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Entered: " + textField.getText());
            }
        });

        frame.add(textField);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
