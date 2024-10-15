public class ThreadCreateExample1 {
    public static void main(String args[]) {
        ThreadCreateExample1_1 t1 = new ThreadCreateExample1_1();
        Runnable r = new ThreadCreateExample1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }

}

class ThreadCreateExample1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++)
            System.out.print(1);
    }
}

class ThreadCreateExample1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++)
            System.out.print(2);
    }
}
