import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat fan = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        String us = fan.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
		System.out.println("India: " + india);
        String china=NumberFormat.getCurrencyInstance(java.util.Locale.CHINA).format(payment);
		System.out.println("China: " + china);
        String france=NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment);
		System.out.println("France: " + france);;
    }
}

