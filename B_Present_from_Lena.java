/*
B - Present from Lena 
 */

import java.util.*;

public class B_Present_from_Lena  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
       // int a[][] = new int[2 * n + 1][2 * n + 1];
       String result[] = new String[input + 1];
        for (int i = 0; i <= input; i++){
            String ans = "";
            for (int j = 0; j < Math.abs(input * 2 - 2 * i); j++) 
				ans += " ";
            for (int k = 0; k <= 2 * i; k++) 
				ans += i - Math.abs(k - i) + " ";
				result[i] = ans.substring(0, ans.length() - 1);
        }
        for (int i = 0; i <= 2 * input; i++) 
			System.out.println(result[input - Math.abs(i - input)]);
        
    
            /*
        for (int i = 0; i < 2 * n + 1; i++) {
            if (true) {
                
            }
            for (int j = 0; j < 2 * n + 1; j++) {
                a[i][j] = 0;
                a[i][n] = i;

                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }*/

    }
}
