import java.util.*;

public class ListIteratorTest {
   public static void main(String args[]) {
      ArrayList al = new ArrayList();
      al.add("C");
      al.add("A");
      al.add("E");

      ListIterator litr = al.listIterator();
      while(litr.hasNext()) {
         Object element = litr.next();
         litr.set(element + "+");
      }

      System.out.print("Modified List backwards: ");
      while(litr.hasPrevious()) {
         Object element = litr.previous();
         System.out.print(element + " ");
      }
      System.out.println();
   }
}

