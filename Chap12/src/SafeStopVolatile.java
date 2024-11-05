class VolatileThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // 작업 수행
        }
    }

    public void stopThread() {
        running = false;
    }
}

public class SafeStopVolatile {
    public static void main(String[] args) throws InterruptedException {
        VolatileThread thread = new VolatileThread();
        thread.start();
        Thread.sleep(1000); // 1초 후에 종료
        thread.stopThread();
    }
}
