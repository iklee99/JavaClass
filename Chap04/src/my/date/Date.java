package my.date;

public class Date {
    final static String[] monthName = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
            "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        boolean leapYear = false;

        // testing leaf year
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0))
            leapYear = true;

        // checking month
        if (month < 1 || month > 12) {
            if (month < 1) month = 1;
            else month = 12;
            System.out.print("Date Constructor: Wrong month < 1 or > 12");
            System.out.println(" month fixed to = " + month);
        }

        // checking day
        if (day < 1) {
            day = 1;
            System.out.print("Date Constructor: Wrong day < 1");
            System.out.println(" day fixed to = 1");
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    System.out.print("Date Constructor: Wrong day > 31");
                    System.out.println(" day fixed to 31");
                    day = 31;
                }
                break;
            case 2:
                if ((leapYear && day > 29)) {
                    System.out.print("Date Constructor: (Leap Year) Wrong Feb. day: " + day);
                    System.out.println(" day fixed to 29");
                    day = 29;
                }
                else if (!leapYear && day > 28) {
                    System.out.print("Date Constructor: (Normal Year) Wrong Feb. day: " + day);
                    System.out.println(" day fixed to 28");
                    day = 28;
                }
                break;
            default: // month = 4, 6, 9, 11
                if (day > 30) {
                    System.out.print("Date Constructor: Wrong day > 30");
                    System.out.println(" day fixed to 30");
                    day = 30;
                }
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        String acbc = "A.C.";
        if (year < 0) {
            year = -1 * year;
            acbc = "B.C.";
        }
        String answer = monthName[month - 1] + "." + day + ", " + year + " " + acbc;
        return answer;
    }
}

