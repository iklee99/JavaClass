import java.util.Stack;

public class StackEmptyMethodExample {
    public static void main(String[] args) {
        //creating an instance of Stack class
        Stack<Integer> stk= new Stack<Integer>();
        
        // checking stack is empty or not
        System.out.println("Is the stack empty? " + stk.empty());
        
        // pushing elements into stack
        stk.push(78);
        stk.push(113);
        //prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
        System.out.println("Is the stack empty? " + stk.empty());
    }
}

