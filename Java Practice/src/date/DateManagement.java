package date;
/*
Month = M(single digit),MM(Double Digit)
Day = d(single digit),DD(Double Digit)
Year = YYYY or yyyy(Complete year), yy,(Last two digit)
Day from the year = D

 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;


public class DateManagement {

    public static void main(String args[]) {

        String format;
        SimpleDateFormat sdf;
        Date d = new Date();
        System.out.println("****** Using SimpleDateFormat and Date Class *******");

        //In the format for current day name in the week
        format = "E";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current Day name in the week: " + sdf.format(d));
//**********************************************************************
        //In the format Era designator
        format = "G";
        sdf = new SimpleDateFormat(format);
        System.out.println("Era designator: " + sdf.format(d));
//**********************************************************************
        //In the format for current Year
        format = "y";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current Year: " + sdf.format(d));
//**********************************************************************
        //In the format for current Month
        format = "M";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current Month: " + sdf.format(d));
//**********************************************************************
        //In the format for week in the year
        format = "w";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current Week in the year: " + sdf.format(d));
//**********************************************************************
        //In the format for week in the month
        format = "W";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current Week in the month: " + sdf.format(d));
//**********************************************************************
        //In the format for current day count
        //Note - Total number of days in a year is 360
        format = "D";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current day in the year: " + sdf.format(d));
//**********************************************************************
        //In the format for day in the month
        format = "d";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current day in the month: " + sdf.format(d)); //Here is object of class Date
        //Work as above
        //int dd = Integer.parseInt(sdf.format(d));
        //System.out.println("Current day: " + dd);4
//**********************************************************************
        //In the format for day of the week in month
        format = "F";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current day of the week in month: " + sdf.format(d));
//**********************************************************************
        //In the format for day number of week, 1 represents Monday
        format = "u";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current day number of week : " + sdf.format(d));
//**********************************************************************
//In the format for AM or PM
        format = "a";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current time in AM or PM: " + sdf.format(d));
//**********************************************************************
        //In the format for hour in the day (0-23)
        format = "H";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current hour : " + sdf.format(d));
//**********************************************************************
        //In the format for hour in the day (1-24)
        format = "k";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current hour : " + sdf.format(d));
//**********************************************************************
        //In the format for hour in am/pm for 12-hour format (0-11)
        format = "K";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current hour in am/pm for 12-hour format (0-11) : " + sdf.format(d));
//**********************************************************************
        //In the format for hour in AM/PM for 12-hour format (1-12)
        format = "h";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current hour in AM/PM for 12-hour format (1-12) : " + sdf.format(d));
//**********************************************************************
        //In the format for minute in the hour
        format = "m";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current minute in the hour : " + sdf.format(d));
//**********************************************************************
        //In the format for second in the minute
        format = "s";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current second in the minute : " + sdf.format(d));
//**********************************************************************
        //In the format for millisecond in the minute
        format = "S";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current millisecond in the minute : " + sdf.format(d));
//**********************************************************************
        //In the format for timezone
        format = "z";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current timezone : " + sdf.format(d));
//**********************************************************************
//In the format for timezone offset in hours (RFC pattern)
        format = "Z";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current timezone offset in hours (RFC pattern) : " + sdf.format(d));
//**********************************************************************
        //In the format for timezone offset in ISO format
        format = "X";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current timezone offset in ISO format : " + sdf.format(d));
//**********************************************************************
        //In the format for full month
        format = "MMMM";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current full month : " + sdf.format(d));
//**********************************************************************
        //In the format for abbreviated month
        format = "MMM";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current abbreviated month : " + sdf.format(d));
//**********************************************************************
        //In the format for numeric Month
        format = "MM";
        sdf = new SimpleDateFormat(format);
        System.out.println("Current numeric month : " + sdf.format(d));
//**********************************************************************
//**********************************************************************

        System.out.println("\n******Different Date time format patterns******");

        //Current date Current time
        System.out.println("Current date Current time: " + d);
//**********************************************************************
        //In the format MM/dd/yyyy
        format = "MM/dd/yyyy";
        sdf = new SimpleDateFormat(format);
        System.out.println(format + " : " + sdf.format(d));
//**********************************************************************
        //In the format dd-M-yyyy hh:mm:ss
        format = "dd-M-yyyy hh:mm:ss";
        sdf = new SimpleDateFormat(format);
        System.out.println(format + " : " + sdf.format(d));
//**********************************************************************
        //In the format dd MMMM yyyy
        format = "dd MMMM yyyy";
        sdf = new SimpleDateFormat(format);
        System.out.println(format + " : " + sdf.format(d));
//**********************************************************************
        //In the format dd MMMM yyyy zzzz
        format = "dd MMMM yyyy zzzz";
        sdf = new SimpleDateFormat(format);
        System.out.println(format + " : " + sdf.format(d));
//**********************************************************************
        //In the format E, dd MMM yyyy HH:mm:ss z
        format = "E, dd MMM yyyy HH:mm:ss z";
        sdf = new SimpleDateFormat(format);
        System.out.println(format + " : " + sdf.format(d));
//**********************************************************************
// **********************************************************************

        System.out.println("\n****** Using LocalDate and Month Class ******");

        //Getting the current date value
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current date: " + currentdate);
        //Getting the current day
        int currentDay = currentdate.getDayOfMonth();
        System.out.println("Current day: " + currentDay);
        //Getting the current month
        Month currentMonth = currentdate.getMonth();
        System.out.println("Current month: " + currentMonth);
        //getting the current year
        int currentYear = currentdate.getYear();
        System.out.println("Current month: " + currentYear);

    }
}

/*
*********************************** OUTPUT ***********************************
****** Using SimpleDateFormat and Date Class *******
Current Day name in the week: Wed
Era designator: AD
Current Year: 2023
Current Month: 2
Current Week in the year: 6
Current Week in the month: 2
Current day in the year: 39
Current day in the month: 8
Current day of the week in month: 2
Current day number of week : 3
Current time inAm or PM: pm
Current hour : 17
Current hour : 17
Current hour in am/pm for 12-hour format (0-11) : 5
Current hour in am/pm for 12-hour format (1-12) : 5
Current minute in the hour : 16
Current second in the minute : 11
Current millisecond in the minute : 299
Current timezone : IST
Current timezone offset in hours (RFC pattern) : +0530
Current timezone offset in ISO format : +05
Current full month : February
Current abbreviated month : Feb
Current numeric month : 02

******Different Date time format patterns******
Current date Current time: Wed Feb 08 17:16:11 IST 2023
MM/dd/yyyy : 02/08/2023
dd-M-yyyy hh:mm:ss : 08-2-2023 05:16:11
dd MMMM yyyy : 08 February 2023
dd MMMM yyyy zzzz : 08 February 2023 India Standard Time
E, dd MMM yyyy HH:mm:ss z : Wed, 08 Feb 2023 17:16:11 IST

****** Using LocalDate and Month Class ******
Current date: 2023-02-08
Current day: 8
Current month: FEBRUARY
Current month: 2023
 */
