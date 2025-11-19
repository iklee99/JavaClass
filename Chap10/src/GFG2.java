import java.util.*;
    
public class GFG2 {
    
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
    
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");
    
        for (int i = 0; i < ll.size(); i++) {  
            System.out.print(ll.get(i) + " "); //Geeks For Geeks
        }

        System.out.println();
    
        for (String str : ll)
            System.out.print(str + " ");      // Geeks For Geeks
    }
}
