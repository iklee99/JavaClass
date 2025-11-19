import java.util.*;

public class StackPushPopExample {
    
    public static void main(String args[]) {
        
        Stack <Integer> stk = new Stack<Integer>();
        System.out.println("stack: " + stk);

        stk.push(20);
        stk.push(13);
        stk.push(89);
        stk.push(90);
        System.out.println("stack: " + stk);

        System.out.println(stk.pop() + " popped");
        System.out.println(stk.pop() + " popped");
        System.out.println("stack: " + stk);
    }
}
