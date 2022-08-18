import java.util.Scanner;

public class NextDayCalculator {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = true;
        boolean isNotLeapYear = false;
        boolean yearDiv400 = year % 400 == 0;
        boolean yearDiv4 = year % 4 == 0;
        boolean yearNotDiv100 = year % 100 != 0;
        if (yearDiv400 || (yearDiv4 && yearNotDiv100)) {
            return isLeapYear;
        } else {
            return isNotLeapYear;
        }
    }

    public static int maxDayOfMonth(int month, int year) {
        int maxDayOfMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDayOfMonth = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDayOfMonth = 30;
                break;

            case 2: {
                if (isLeapYear(year)) {
                    maxDayOfMonth = 29;
                } else {
                    maxDayOfMonth = 28;
                }
                break;
            }
        }
        return maxDayOfMonth;
    }

    public static String calculatorNextDay(int day, int month, int year) {
        int nextDay;
        int nextMonth;
        int nextYear;

        int maxDayOfMonth = maxDayOfMonth(month, year);
        if (day == maxDayOfMonth) {
            if (month == 12) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = year + 1;
            } else {
                nextDay = 1;
                nextMonth = month + 1;
                nextYear = year;
            }
        } else {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        }
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day;
        do {
            System.out.println("Enter year: ");
            year = sc.nextInt();
            if (year < 0) {
                System.out.println("Year is not validation");
            }
        } while (year < 0);

        do {
            System.out.println("Enter month: ");
            month = sc.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Month is not validation");
            }
        } while (month < 0 || month > 12);
        int maxDayOfMonth = maxDayOfMonth(month, year);
        do {
            System.out.println("Enter day: ");
            day = sc.nextInt();
            if (day < 0 || day > maxDayOfMonth) {
                System.out.println(" Day is not validation");
            }
        } while (day < 0 || day > maxDayOfMonth);
        System.out.println("Day: " + day + "/" + month + "/" + year);
        String nextDay = calculatorNextDay(day, month, year);
        System.out.println("Next day: " + nextDay);
    }
}
