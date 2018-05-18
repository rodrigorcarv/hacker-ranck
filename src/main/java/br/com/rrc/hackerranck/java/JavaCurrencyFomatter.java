package br.com.rrc.hackerranck.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
    Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  
    into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

    US: formattedPayment
    India: formattedPayment
    China: formattedPayment
    France: formattedPayment
    where  is  formatted according to the appropriate Locale's currency.
    
    Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
    
    Input Format
    
    A single double-precision number denoting .
    
    Constraints
    
    Output Format
    
    On the first line, print US: u where  is  formatted for US currency. 
    On the second line, print India: i where  is  formatted for Indian currency. 
    On the third line, print China: c where  is  formatted for Chinese currency. 
    On the fourth line, print France: f, where  is  formatted for French currency.
    
    Sample Input
    
    12324.134
    Sample Output
    
    US: $12,324.13
    India: Rs.12,324.13
    China: ￥12,324.13
    France: 12 324,13 €
    Explanation
    
    Each line contains the value of  formatted according to the four countries' respective currencies.
 */

public class JavaCurrencyFomatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //payment = (double) Math.round(payment * 100) / 100;


        DecimalFormat india = ((DecimalFormat) NumberFormat.getInstance(Locale.ENGLISH));
        india.applyPattern("###,##0.00");

        DecimalFormat france = ((DecimalFormat) NumberFormat.getCurrencyInstance(Locale.FRANCE));
        france.applyPattern("###,##0.00");

        String us =  NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        DecimalFormat china  = ((DecimalFormat) NumberFormat.getInstance(Locale.CHINA));
        china.applyPattern("###,##0.00"); 

        System.out.println(String.format("US: %s", us));
        System.out.println(String.format("India: Rs.%s", india.format(payment)));
        System.out.println(String.format("China: ￥%s", china.format(payment)));
        System.out.println(String.format("France: %s €", france.format(payment)));
        
        
        /**
         * 
        payment = (double) Math.round(payment * 100) / 100;

        NumberFormat india = NumberFormat.getInstance(Locale.ENGLISH);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getInstance(Locale.CHINA);

        System.out.println(String.format("US: %s", us.format(payment)));
        System.out.println(String.format("India: Rs.%s", india.format(payment)));
        System.out.println(String.format("China: ￥%s", china.format(payment)));
        System.out.println(String.format("France: %s", france.format(payment)));
         */
    }
}
