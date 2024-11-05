import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//JFrame 상속
public class InvokeLater extends JFrame {
    public InvokeLater() {
        //제목 설정
        setTitle("Swing App");
        //윈도우 크기 설정
        setSize(300, 100);
        //윈도우 종료 버튼을 클릭하면 프로세스 종료
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        //이벤트 큐에 Runnable 넣기
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //윈도우 생성
                InvokeLater app = new InvokeLater();
                //윈도우를 보여줌
                app.setVisible(true);
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
}
