public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        workThreadA.work = false;

        try { Thread.sleep(10000); } catch (InterruptedException e) {}
        workThreadA.work = true;
    }
}

class WorkThread extends Thread {
    //필드
    public boolean work = true;

    //생성자
    public WorkThread(String name) {
        setName(name);
    }

    //메소드
    @Override
    public void run() {
        while(true) {
            if(work) {
                System.out.println(getName() + ": 작업처리");
            } else {
                Thread.yield();
            }
        }
    }
}
