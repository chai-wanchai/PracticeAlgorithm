/*
B - Two Buttons

 */

import java.util.*;
import java.io.*;

public class B_Two_Buttons {

    //http://codeforces.com/problemset/problem/115/A
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int m = in.nextInt();

        int count = 0;
        while (m != n) {
            if (n > m) {
                count += n - m;
                break;
            }
            if (m % 2 == 0) {
                m /= 2;
                count++;
            } else {
                m++;
                count++;
            }
        }

        System.out.println(count);
		

    }

}