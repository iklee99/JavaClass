import java.util.*;  

public class PriorityQueueTest {  
    public static void main(String args[]){  
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
        queue.add(4);  
        System.out.println("Adding 4: " + queue);
        queue.add(7);  
        System.out.println("Adding 7: " + queue);
        queue.add(2);  
        System.out.println("Adding 2: " + queue);
        queue.add(5);  
        System.out.println("Adding 5: " + queue);
        queue.add(9); 
        System.out.println("Adding 9: " + queue);
        System.out.print("Removing " + queue.peek() + ": ");
        queue.remove(); 
        System.out.println(queue); 
        System.out.println("Removing " + queue.poll() + ": " + queue); 
    }  
} 
