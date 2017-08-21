/*
C - Party 
//http://codeforces.com/problemset/problem/115/A
*/

import java.util.*;
import java.io.*;

public class C_Party  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        Vector<Integer> d = new Vector<Integer>();
        for (int i = 0; i <= n; i++) {
            if (i==0) {
                d.add(0);
            } else {
                d.add(in.nextInt());
            }
         
        }
       
        int max = 0;
       
        for (int i = 1; i <= n; i++) {
            int x = d.get(i);
            int count = 1;
            while (x != -1) {
                count++;
                x = d.get(x);
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }

}
