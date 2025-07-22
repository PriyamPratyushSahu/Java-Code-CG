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

    public static void main(String[] args) {

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
        System.out.println("Current hour in AM/PM for 12-hour format (0-11) : " + sdf.format(d));
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
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();

        System.out.println("Current date: " + currentDate);
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month (enum): " + currentDate.getMonth());
        System.out.println("Month (numeric): " + currentDate.getMonthValue());
        System.out.println("Day of Month: " + currentDate.getDayOfMonth());
        System.out.println("Day of Week: " + currentDate.getDayOfWeek());
        System.out.println("Day of Year: " + currentDate.getDayOfYear());
        System.out.println("Length of Month: " + currentDate.lengthOfMonth());
        System.out.println("Length of Year: " + currentDate.lengthOfYear());
        System.out.println("Is Leap Year: " + currentDate.isLeapYear());

        System.out.println("\nDate after 5 days: " + currentDate.plusDays(5));
        System.out.println("Date before 5 days: " + currentDate.minusDays(5));
        System.out.println("With Day of Month set to 1: " + currentDate.withDayOfMonth(1));
        System.out.println("With Month set to January: " + currentDate.withMonth(1));

        //LocalDate anotherDate = LocalDate.of(2025, 12, 25);
        LocalDate anotherDate = LocalDate.of(2025, 9, 25);
        System.out.println("\nAnother Date: " + anotherDate);
        System.out.println("Is current date before another date? " + currentDate.isBefore(anotherDate));
        System.out.println("Is current date after another date? " + currentDate.isAfter(anotherDate));
        System.out.println("Compare current date to another date: " + currentDate.compareTo(anotherDate));


        // Month class methods
        System.out.println("Current date: " + currentDate);
        System.out.println("\nMonth Enum: " + currentMonth);
        System.out.println("Month Value: " + currentMonth.getValue());
        System.out.println("Days in Month (non-leap): " + currentMonth.length(false));
        System.out.println("Days in Month (leap): " + currentMonth.length(true));
        System.out.println("Next Month: " + currentMonth.plus(1)); //currentMonth.minus(-1)
        System.out.println("Previous Month: " + currentMonth.minus(1)); //currentMonth.plus(-1)

    }
}
/* ********* Using SimpleDateFormat and Date Class *********

Format	    Meaning	                                    Example Output
----------------------------------------------------------------------|
E	        Day name in the week (short)	            Tue
G	        Era designator	                            AD
y	        Year (full)	                                2025
M	        Month (1-12)	                            7
w	        Week in year	                            30
W	        Week in month	                            4
D	        Day in year	                                203
d	        Day in month	                            22
F	        Day of week in month (e.g., 3rd Tuesday)	4
u	        Day number of week (1 = Monday, 7 = Sunday)	2
a	        AM/PM marker	                            AM
H	        Hour in day (0–23)	                        8
k	        Hour in day (1–24)	                        9
K	        Hour in AM/PM (0–11)	                    8
h	        Hour in AM/PM (1–12)	                    8
m	        Minute in hour	                            37
s	        Second in minute	                        21
S	        Millisecond	                                123
z	        Time zone name	                            IST
Z	        Time zone offset (RFC 822)	                +0530
X	        ISO 8601 time zone	                        +05
MMMM	    Full month name	                            July
MMM	        Abbreviated month name	                    Jul
MM	        Numeric month with leading zero	            07
*/

/* ********* Different Date-Time Format Patterns *********

Pattern	                    Description	                        Example Output
------------------------------------------------------------------------------|
MM/dd/yyyy	                US-style date	                    07/22/2025
dd-M-yyyy hh:mm:ss	        Day-Month-Year with time	        22-7-2025 08:37:21
dd MMMM yyyy	            Full month name	                    22 July 2025
dd MMMM yyyy zzzz	        Full date with time zone	        22 July 2025 India Standard Time
E, dd MMM yyyy HH:mm:ss z	Full date-time with day and zone	Tue, 22 Jul 2025 08:37:21 IST
 */

/* ********* Using LocalDate and Month Class *********

Format	            Meaning	                                        Example Output
----------------------------------------------------------------------------------|
LocalDate.now()	    Gets current system date	                    2025-07-22
getYear()	        Gets the year	                                2025
getMonth()	        Gets the month as enum	                        JULY
getMonthValue()	    Gets the month as number	                    7
getDayOfMonth()	    Gets the day of the month	                    22
getDayOfWeek()	    Gets the day of the week	                    TUESDAY
getDayOfYear()	    Gets the day number in the year	                203
lengthOfMonth()	    Number of days in the month	                    31
lengthOfYear()	    Number of days in the year	                    365
isLeapYear()	    Checks if the year is a leap year	            false
plusDays(n)	        Adds n days to the date	                        2025-07-27
minusDays(n)	    Subtracts n days from the date	                2025-07-17
withDayOfMonth(n)	Sets the day of the month	                    2025-07-01
withMonth(n)	    Sets the month	                                2025-01-22
isBefore(date)	    Checks if current date is before another date	true
isAfter(date)	    Checks if current date is after another date	false
compareTo(date)	    Compares current date to another date	        -65
Month.getValue()	Gets numeric value of the month	                7
Month.length(false)	Days in month (non-leap year)	                31
Month.length(true)	Days in month (leap year)	                    31
Month.plus(n)	    Gets next month	                                AUGUST
Month.minus(n)	    Gets previous month	                            JUNE
*/

/*
*********************************** OUTPUT ***********************************
****** Using SimpleDateFormat and Date Class *******
Current Day name in the week: Tue
Era designator: AD
Current Year: 2025
Current Month: 7
Current Week in the year: 30
Current Week in the month: 4
Current day in the year: 203
Current day in the month: 22
Current day of the week in month: 4
Current day number of week : 2
Current time in AM or PM: am
Current hour : 10
Current hour : 10
Current hour in AM/PM for 12-hour format (0-11) : 10
Current hour in AM/PM for 12-hour format (1-12) : 10
Current minute in the hour : 13
Current second in the minute : 24
Current millisecond in the minute : 748
Current timezone : IST
Current timezone offset in hours (RFC pattern) : +0530
Current timezone offset in ISO format : +05
Current full month : July
Current abbreviated month : Jul
Current numeric month : 07

******Different Date time format patterns******
Current date Current time: Tue Jul 22 10:13:24 IST 2025
MM/dd/yyyy : 07/22/2025
dd-M-yyyy hh:mm:ss : 22-7-2025 10:13:24
dd MMMM yyyy : 22 July 2025
dd MMMM yyyy zzzz : 22 July 2025 India Standard Time
E, dd MMM yyyy HH:mm:ss z : Tue, 22 Jul 2025 10:13:24 IST

****** Using LocalDate and Month Class ******
Current date: 2025-07-22
Year: 2025
Month (enum): JULY
Month (numeric): 7
Day of Month: 22
Day of Week: TUESDAY
Day of Year: 203
Length of Month: 31
Length of Year: 365
Is Leap Year: false

Date after 5 days: 2025-07-27
Date before 5 days: 2025-07-17
With Day of Month set to 1: 2025-07-01
With Month set to January: 2025-01-22

Another Date: 2025-09-25
Is current date before another date? true
Is current date after another date? false
Compare current date to another date: -2
Current date: 2025-07-22

Month Enum: JULY
Month Value: 7
Days in Month (non-leap): 31
Days in Month (leap): 31
Next Month: AUGUST
Previous Month: JUNE
 */
