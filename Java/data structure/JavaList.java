import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int numberOfItemsInList = sc.nextInt();
		List container = new LinkedList();
		sc.nextLine();
		for (int i = 0; i < numberOfItemsInList; i++) {
			container.add(sc.nextInt());
		}
		sc.nextLine();
		int numOfQueries = sc.nextInt();
		for (int i = 0; i < numOfQueries; i++) {
			String command = sc.next();
		
			if (command.equals("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();
                container.add(index,value);
			}
			if (command.equals("Delete")) {
				int index = sc.nextInt();
				container.remove(index);
				
			}
            
			
		}
		container.forEach((item)->{System.out.print(item+" ");});;
		
	   }
}
