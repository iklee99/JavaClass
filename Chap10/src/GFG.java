import java.util.*;

public class GFG {

    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");     // [Geeks]
        ll.add("Heeks");     // [Geeks, Heeks]
        ll.add(1, "Jeeks");  // [Geeks, Jeeks, Heeks]

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "For");    // [Geeks, For, Heeks]

        System.out.println("Updated LinkedList " + ll);
    }
}

