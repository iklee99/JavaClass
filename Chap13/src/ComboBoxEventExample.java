import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxEventExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ComboBox Event Example");
            String[] items = { "Item 1", "Item 2", "Item 3" };
            JComboBox<String> comboBox = new JComboBox<>(items);

            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Selected: " + comboBox.getSelectedItem());
                }
            });

            frame.setLayout(new FlowLayout());
            frame.add(comboBox);
            frame.setSize(300, 100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
