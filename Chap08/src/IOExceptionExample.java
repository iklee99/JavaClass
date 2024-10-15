import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 read 중에 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            if (reader != null) {  reader.close();  }
        } catch (IOException e) {
            System.out.println("파일을 close 하는 중에 exception 발생: " + e.getMessage());
        }
    }
}

