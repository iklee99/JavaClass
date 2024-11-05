public class SynchronizedExample2 {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();

        User1Thread2 user1Thread = new User1Thread2();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread2 user2Thread = new User2Thread2();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}

class User1Thread2 extends Thread {
    private Calculator2 calculator;

    public User1Thread2() {
        setName("User1Thread");
    }

    public void setCalculator(Calculator2 calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}

class User2Thread2 extends Thread {
    private Calculator2 calculator;

    public User2Thread2() {
        setName("User2Thread");
    }

    public void setCalculator(Calculator2 calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}

class Calculator2 {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
    }

    public void setMemory2(int memory) {
        synchronized(this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
        }
    }
}
