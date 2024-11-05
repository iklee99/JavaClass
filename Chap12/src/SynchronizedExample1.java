public class SynchronizedExample1 {
    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();

        User1Thread1 user1Thread = new User1Thread1();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread1 user2Thread = new User2Thread1();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}

class User1Thread1 extends Thread {
    private Calculator1 calculator;

    public User1Thread1() {
        setName("User1Thread");
    }

    public void setCalculator(Calculator1 calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(100);
    }
}

class User2Thread1 extends Thread {
    private Calculator1 calculator;

    public User2Thread1() {
        setName("User2Thread");
    }

    public void setCalculator(Calculator1 calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(50);
    }
}

class Calculator1 {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
    }
}


