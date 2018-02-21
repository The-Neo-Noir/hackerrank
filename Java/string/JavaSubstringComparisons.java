import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int tracingIndex=0;
       
        List <String>holder= new ArrayList<>();
        while(tracingIndex<=s.length()-k){
           holder.add( s.substring(tracingIndex,tracingIndex+k));
            tracingIndex++;
        }
        Collections.sort(holder);
        smallest=holder.get(0);
        largest=holder.get(holder.size()-1).toString();
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

