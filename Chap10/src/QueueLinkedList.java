import java.util.LinkedList;
import java.util.Queue;
 
public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();  // creating queue
        queue.offer(5);  queue.offer(1);  queue.offer(2);  queue.offer(3);
        queue.offer(4); // pushing 5 data
        System.out.println(queue);
        System.out.print("poll: " + queue.poll() + " "); System.out.println(queue); //poll
        System.out.print("poll: " + queue.poll() + " "); System.out.println(queue); //poll
        System.out.print("poll: " + queue.poll() + " "); System.out.println(queue); //poll
        System.out.print("peek: " + queue.peek() + " "); System.out.println(queue); //peek
        System.out.print("peek: " + queue.peek() + " "); System.out.println(queue); //peek
    }
}

