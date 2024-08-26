package my.date;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("\n25, 4, -3295   ");
        Date date1 = new Date(25, 4, -3295);
        System.out.println(date1);

        System.out.println("\n29, 2, 1900   ");
        Date date2 = new Date(29, 2, 1900);
        System.out.println(date2);

        System.out.println("\n29, 2, 1898   ");
        Date date3 = new Date(29, 2, 1898);
        System.out.println(date3);

        System.out.println("\n5, -3, 1995   ");
        Date date4 = new Date(5, -3, 1995);
        System.out.println(date4);

        System.out.println("\n15, 2, 2148   ");
        Date date5 = new Date(15, 2, 2148);
        System.out.println(date5);
    }
}

