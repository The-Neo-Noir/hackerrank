import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String format="%"+n+"s\n";
        StringBuffer sb= new StringBuffer();
        for(int i=1;i<=n;i++){
            sb.append("#");
            System.out.printf(format,sb.toString());
        }
    }
}
