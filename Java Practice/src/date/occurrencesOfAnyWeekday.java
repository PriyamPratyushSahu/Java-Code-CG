package date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class occurrencesOfAnyWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year, month, and weekday
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter weekday (e.g., MONDAY, TUESDAY): ");
        String weekdayInput = scanner.next().toUpperCase();
        DayOfWeek targetDay = DayOfWeek.valueOf(weekdayInput);

        LocalDate date = LocalDate.of(year, month, 1);
        int count = 0;

        System.out.println("\nOccurrences of " + targetDay + " in " + date.getMonth() + " " + year + ":");
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == targetDay) {
                count++;
                System.out.println(count + " " + targetDay + ": " + date);
            }
            date = date.plusDays(1);
        }

        scanner.close();
    }
}
/*
*********************************** OUTPUT ***********************************

        Enter year (e.g., 2025): 2025
        Enter month (1-12): 6
        Enter weekday (e.g., MONDAY, TUESDAY): WEDNESDAY

        Occurrences of WEDNESDAY in JUNE 2025:
        1 WEDNESDAY: 2025-06-04
        2 WEDNESDAY: 2025-06-11
        3 WEDNESDAY: 2025-06-18
        4 WEDNESDAY: 2025-06-25
*/