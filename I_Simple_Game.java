/*

*/
import java.util.*;
import java.io.*;

public class I_Simple_Game  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

        //////I - Simple Game 
        long n = in.nextLong();
        int m = in.nextInt();
        if (n==1) {
            System.out.println("1");
        }else if (m>n/2) {
            System.out.println(m-1);
        }else {
            System.out.println(m+1);
        
        }
        //System.out.println(n==1?1:m>n/2?m-1:m+1);
        
    }

}
