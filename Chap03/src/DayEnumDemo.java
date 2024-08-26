
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class DayEnumDemo {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(today + " is a weekend.");
                break;
            default:
                System.out.println(today + " is a weekday.");
                break;
        }

        // output all days
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            String name = day.name();
            int order = day.ordinal();
            System.out.println(order + ") " + day + " " + name + " ");
        }
        Day theDay = Day.valueOf("FRIDAY");
    }
}
