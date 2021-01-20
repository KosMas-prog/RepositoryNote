package lesson_1_2;

public class DayOfWeekMain {
    public static void main(String[] args) {

        System.out.println(getWorkingHours(DayOfWeek.MONDAY));

    }

    private static int getWorkingHours(DayOfWeek a) {
        return a.getHours();
    }

}
