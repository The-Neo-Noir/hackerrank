import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IceCreamParlor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        int testCaseCount=Integer.parseInt(sc.nextLine());
         int haveDollar[]= new int[testCaseCount];
        
        int flavorAvialable[]=new int[testCaseCount];
      
        int priceOfFlavors[][] =new int[testCaseCount][];
        
        for(int curCount=0;curCount<testCaseCount;curCount++){
            haveDollar[curCount]=Integer.parseInt(sc.nextLine());
            flavorAvialable[curCount]=Integer.parseInt(sc.nextLine());
            int flavorlist[]=new int[flavorAvialable[curCount]];
            for(int i=0;i<flavorAvialable[curCount];i++){
                flavorlist[i]=sc.nextInt();
            }
            if(curCount!=testCaseCount-1){
            sc.nextLine();
            }
            priceOfFlavors[curCount]=flavorlist;
        }
        for(int j=0;j<testCaseCount;j++)
        test(flavorAvialable[j],priceOfFlavors[j],haveDollar[j]);
}
    
    public static void test(int flavorAvialable,int [] priceOfFlavors,int haveDollar){

        boolean flag=false;
        int first=0;
        int second=0;
         for(int i=0;i<flavorAvialable;i++){
             for(int j=i+1;j<flavorAvialable;j++){
                 if(priceOfFlavors[i]+priceOfFlavors[j]==haveDollar){
                     first=i+1;
                     second=j+1;
                    flag=true;
                    break; 
                 }
                 if(flag==true){
                     break;
                 }
        } 
    } 
     System.out.println(first+" "+second);
    }
}
