import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // ActionListener for menu items
        ActionListener menuListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command) {
                    case "Open":
                        System.out.println("Open menu item selected");
                        break;
                    case "Save":
                        System.out.println("Save menu item selected");
                        break;
                    case "Exit":
                        System.out.println("Exiting the application");
                        System.exit(0);
                        break;
                }
            }
        };

        // Add ActionListener to menu items
        openItem.addActionListener(menuListener);
        saveItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
