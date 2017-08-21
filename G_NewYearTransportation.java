/*

 */

import java.util.*;
import java.io.*;

public class G_NewYearTransportation {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int t = in.nextInt();
        int a[] = new int[n];
        int x = 1;
        for (int i = 1; i < n; i++) {
            a[i] = in.nextInt();

        }
        do {
            x += a[x];
        } while (x < t);
        if (x == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        
    }

}
