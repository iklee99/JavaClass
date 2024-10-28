import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
        }
        catch (IOException e) {
            System.out.println("파일을 read 중에 오류가 발생: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
    }
}
