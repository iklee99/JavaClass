import java.util.ArrayList;
import java.util.Collections;    // utility class for Collection (ex. sort())

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
        System.out.println("list1:" + list1);  // list1:[5, 4, 2, 0, 1, 3]
        System.out.println("list2:" + list2);  // list2:[4, 2, 0]
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("list1:" + list1);  // list1:[0,1,2,3,4,5]
        System.out.println("list2:" + list2);  // list2:[0,2,4]

        System.out.println("list1.containsall(list2):" +
                            list1.containsAll(list2)); // list1.containsall(list2):true
    }
}
