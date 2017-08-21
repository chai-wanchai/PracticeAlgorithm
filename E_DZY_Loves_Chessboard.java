/*
E - DZY Loves Chessboard 
https://cn.vjudge.net/contest/168268#problem/E
 */

 /*


 */
import java.util.*;
import java.io.*;

public class E_DZY_Loves_Chessboard  {

   
    
    static int n, m;
   
    static String s[];

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        n = in.nextInt();
        m = in.nextInt();

        String s;

        for (int i = 0; i < n; i++) {
            s = in.next();
            for (int j = 0; j < s.length(); j++) {

                System.out.print(s.charAt(j) == '.' ? (i + j) % 2 == 0 ? 'B' : 'W' : s.charAt(j));

            }
            System.out.println("");

        }
    }

}
