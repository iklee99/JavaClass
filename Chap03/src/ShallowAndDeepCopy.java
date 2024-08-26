public class ShallowAndDeepCopy {
    public static void main(String[] args) {

        Data2[] d = new Data2[2];  // d[0] = d[1] = null
        Data2[] e = new Data2[2];  // e[0] = d[1] = null

        for (int i = 0; i < d.length; i++) {
            d[i] = new Data2();
            d[i].y = i + 5;
        }

        for (int i = 0; i < e.length; i++) { // shallow copy
            e[i] = d[i];
        }

        System.out.println("--- After shallow copy ---");
        System.out.println("--- d ---");
        for (int i = 0; i < d.length; i++) System.out.print(d[i].y + " ");
        System.out.println();
        System.out.println("--- e ---");
        for (int i = 0; i < e.length; i++) System.out.print(e[i].y + " ");
        System.out.println();

        for (int i = 0; i < d.length; i++) {
            d[i].y = i + 10;
        }

        System.out.println("\n--- After changing d[i].y ---");
        System.out.println("--- d ---");
        for (int i = 0; i < d.length; i++) System.out.print(d[i].y + " ");
        System.out.println();
        System.out.println("--- e ---");
        for (int i = 0; i < e.length; i++) System.out.print(e[i].y + " ");
        System.out.println();
        System.out.println();

        for (int i = 0; i < e.length; i++) { // deep copy
            e[i] = new Data2();
            e[i].y = d[i].y;
        }

        System.out.println("\n--- After deep copy ---");
        System.out.println("--- d ---");
        for (int i = 0; i < d.length; i++) System.out.print(d[i].y + " ");
        System.out.println();
        System.out.println("--- e ---");
        for (int i = 0; i < e.length; i++) System.out.print(e[i].y + " ");
        System.out.println();
        System.out.println();

        for (int i = 0; i < d.length; i++) {
            d[i].y = i + 20;
        }

        System.out.println("\n--- After changing d[i].y ---");
        System.out.println("--- d ---");
        for (int i = 0; i < d.length; i++) System.out.print(d[i].y + " ");
        System.out.println();
        System.out.println("--- e ---");
        for (int i = 0; i < e.length; i++) System.out.print(e[i].y + " ");
        System.out.println();
        System.out.println();
    }
}

class Data2 {
    int y;
}
