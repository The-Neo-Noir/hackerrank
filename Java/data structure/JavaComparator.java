// Write your Checker class here
import java.util.*;
class Checker implements Comparator<Player>{
    
    public int compare(Player obj1, Player obj2){
       if(obj1.score > obj2.score){
           return -1;
       }else if(obj1.score==obj2.score){
           return obj1.name.compareTo(obj2.name);
       }else{
           return 1;
       }
       
    }
}

class Checker implements Comparator<Player>{
    
    public int compare(Player obj1, Player obj2){
       if(obj1.score > obj2.score){
           return -1;
       }else if(obj1.score==obj2.score){
           return obj1.name.compareTo(obj2.name);
       }else{
           return 1;
       }
       
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
