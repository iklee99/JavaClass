import javax.swing.*;

public class OptionPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OptionPane Example");

        String message = "Do you want to continue?";
        int option = JOptionPane.showConfirmDialog(frame, message);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "You selected Yes");
        } else {
            JOptionPane.showMessageDialog(frame, "You selected No or Cancel");
        }

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

