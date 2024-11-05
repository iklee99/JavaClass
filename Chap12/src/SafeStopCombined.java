import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CombinedSafeStopTask implements Runnable {
    // Volatile 플래그를 사용해 작업 종료 상태를 추적
    private volatile boolean running = true;

    @Override
    public void run() {
        try {
            while (running && !Thread.currentThread().isInterrupted()) {
                // 작업 수행
                System.out.println("Task is running...");

                // 차단 메서드 사용 (예: sleep)
                Thread.sleep(200); // 200ms 동안 멈춤

                // 추가 작업 수행
            }
        } catch (InterruptedException e) {
            // InterruptedException 발생 시 처리
            System.out.println("Thread was interrupted during sleep.");
            Thread.currentThread().interrupt(); // 인터럽트 상태 복구
        } finally {
            // 리소스 해제 및 종료 작업
            System.out.println("Task is stopping safely...");
        }
    }

    // 안전하게 종료하기 위한 메서드
    public void stop() {
        running = false;
    }
}

public class SafeStopCombined {
    public static void main(String[] args) throws InterruptedException {
        // ExecutorService 생성
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CombinedSafeStopTask task = new CombinedSafeStopTask();

        // 작업 제출
        executor.submit(task);

        // 1초 후에 작업을 안전하게 종료
        Thread.sleep(1000); // 1초 대기
        task.stop(); // Volatile 플래그를 false로 설정
        executor.shutdown(); // 새로운 작업을 거부

        // 1초 안에 종료되지 않으면 강제 종료
        if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
            executor.shutdownNow(); // 실행 중인 작업을 인터럽트
        }
    }
}
