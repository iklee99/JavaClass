import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

   public static void main(String args[]) {
      ArrayList al = new ArrayList();  
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");

      System.out.print("Original contents of al: ");
      Iterator itr = al.iterator();
      
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
   }
}
