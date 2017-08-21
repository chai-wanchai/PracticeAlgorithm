/*
A - BerSU Ball 

*/
import java.util.*;
import java.io.*;

public class A_BerSU_Ball  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, count = 0;
       
        while (i < n && j < m) {
            if (a[i] - b[j] > 1) {
                j++;
            } else if (b[j] - a[i] > 1) {
                i++;
            } else {
                i++;
                j++;
                count++;
            }
        }
        
        System.out.println(count);

    }

}