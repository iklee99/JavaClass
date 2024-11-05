import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame 상속
public class SwingApp extends JFrame {
    public SwingApp() {
        //제목 설정
        setTitle("Swing App");
        //윈도우 크기 설정
        setSize(300, 100);
        //JButton 추가
        getContentPane().add(new JButton("Ok"), BorderLayout.SOUTH);
        //윈도우 종료 버튼을 클릭하면 프로세스 종료
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        //윈도우 생성
        SwingApp app = new SwingApp();
        //윈도우를 보여줌
        app.setVisible(true);
    }
}
