class InterruptibleThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // 작업 수행
                Thread.sleep(100); // 차단 상태일 수 있음
            }
        } catch (InterruptedException e) {
            // 인터럽트가 발생했을 때 처리
            System.out.println("Thread interrupted");
        }
    }
}

public class SafeStopInterrupt {
    public static void main(String[] args) throws InterruptedException {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start();
        Thread.sleep(1000); // 1초 후에 인터럽트
        thread.interrupt();
    }
}
