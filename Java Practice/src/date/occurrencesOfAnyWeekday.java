package date;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class occurrencesOfAnyWeekday {

    void displayWeekDays(int year, int month, DayOfWeek targetDay) {
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
    }

    public static void main(String[] args) {

        occurrencesOfAnyWeekday ow = new occurrencesOfAnyWeekday();
        Scanner scanner = new Scanner(System.in);


        int year;
        int month;
        DayOfWeek targetDay;
        //Enter choice
        int ch;

        do {
            System.out.print("Press 1 for custom day\nPress 2 for default day\nEnter your choice: ");
            ch = scanner.nextInt();
            if (ch == 1) {
                // Input year, month, and weekday
                System.out.print("Enter year (e.g., 2025): ");
                year = scanner.nextInt();

                System.out.print("Enter month (1-12): ");
                month = scanner.nextInt();

                System.out.print("Enter weekday (e.g., MONDAY, TUESDAY): ");
                String weekdayInput = scanner.next().toUpperCase();
                targetDay = DayOfWeek.valueOf(weekdayInput);

                ow.displayWeekDays(year, month, targetDay);

            } else if (ch == 2) {
                String format;
                SimpleDateFormat sdf;
                Date d = new Date();

                format = "y";
                sdf = new SimpleDateFormat(format);
                year = Integer.parseInt(sdf.format(d));

                format = "M";
                sdf = new SimpleDateFormat(format);
                month = Integer.parseInt(sdf.format(d));

                LocalDate currentdate = LocalDate.now();
                targetDay = currentdate.getDayOfWeek();
                System.out.println(targetDay);

                ow.displayWeekDays(year, month, targetDay);
            }
            System.out.println("Press 0 to continue");
            ch = scanner.nextInt();
        } while (ch == 0);
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