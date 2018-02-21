import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        try{
          int input1= sc.nextInt();
          int   input2= sc.nextInt();
            System.out.println(input1/input2);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(java.lang.ArithmeticException e){
           System.out.println("java.lang.ArithmeticException: "+e.getMessage()); 
        }
        
    }
}
