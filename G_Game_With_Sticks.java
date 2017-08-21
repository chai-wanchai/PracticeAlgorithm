/*
G - Game With Sticks 
Input
The first line of input contains two space-separated integers, n and m (1?<=?n,?m?<=?100).

Output
Print a single line containing "Akshat" or "Malvika" (without the quotes), depending on the winner of the game.

*/
import java.util.*;

public class G_Game_With_Sticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (Math.min(m, n)%2 ==0) {
            System.out.println("Malvika");
        }else{
          System.out.println("Akshat");
        }
        

    }
}
