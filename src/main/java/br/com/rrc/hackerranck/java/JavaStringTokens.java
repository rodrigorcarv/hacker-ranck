package br.com.rrc.hackerranck.java;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        
        if (s.matches("[A-Za-z !,?._'@]+")) {
        	s = s.trim().replaceAll("[^A-Za-z]+", "#");
        	
        	if ("".equals(s)) {
            	System.out.println(0);
        	} else {
        		
        		String[] split = s.trim().split("#");
            	
            	System.out.println(split.length);
            	
            	for (String string : split) {
    				System.out.println(string);
    			}
        	}
        }
        scan.close();
    }
}