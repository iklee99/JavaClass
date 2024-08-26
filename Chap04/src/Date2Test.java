public class Date2Test {
    public static void main(String[] args) {
        //Date2 d = new Date2();  // ERROR! no default constructor provided
    }
}

class Date2
{
    private int month;
    private int day;
    private int year;

    public Date2(int month, int day, int year) { // user-written constructor
        this.month = month;
        this.day = day;
        this.year = year;
    }
}

