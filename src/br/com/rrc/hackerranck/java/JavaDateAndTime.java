package br.com.rrc.hackerranck.java;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author vagrant
 
    The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar 
    fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

    You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion 
    of the code in the editor.
    
    For example, if you are given the date , the method should return  as the day on that date.
    
    Input Format
    
    A single line of input containing the space separated month, day and year, respectively, in    format.
    
    Constraints
    
    Output Format
    
    Output the correct day in capital letters.
    
    Sample Input

        08 05 2015
    Sample Output

        WEDNESDAY
    Explanation
    
    The day on August th  was WEDNESDAY.
 */

public class JavaDateAndTime {
    public static String getDay(String day, String month, String year) {
        Integer ano = Integer.valueOf(year);
        if (ano > 2000 && ano < 3000) {
            LocalDate localDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
            return localDate.getDayOfWeek().name(); 
        }
        return "Informed year is out of range defined";
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
