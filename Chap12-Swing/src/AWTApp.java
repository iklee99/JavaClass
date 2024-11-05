import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame 상속
public class AWTApp extends Frame {
    public AWTApp() {
        //제목 설정
        setTitle("AWT App");
        //윈도우 크기 설정
        setSize(300, 100);
        //Button 추가
        add(new Button("Ok"), BorderLayout.SOUTH);
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
        AWTApp app = new AWTApp();
        //윈도우를 보여줌
        app.setVisible(true);
    }
}
