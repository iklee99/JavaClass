import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SafeStopExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2); // thread pool 생성 (2개 thread)
        executor.submit(() -> { // pool의 1st thread에게 작업 의뢰
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " running");
            }
        });
        executor.submit(() -> { // pool의 2nd thread에게 작업 의뢰
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " running");
            }
        });
        Thread.sleep(10); // 10 miliseconds (0.001초) 후에 종료
        executor.shutdown(); // ExecutorService 종료
        if (!executor.awaitTermination(10, TimeUnit.MILLISECONDS)) {
            executor.shutdownNow(); // 강제 종료
        }
    }
}
