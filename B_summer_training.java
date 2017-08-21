
import java.util.*;
import java.io.*;

public class B_summer_training {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int a[] = new int[1001];
        int c=0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a[x]++;
            System.out.println(a[x]);
            if (c<a[x]) {
                c=a[x];
                System.out.println(c + "  dd");
            }
        }
       
        System.out.println(n-c);
    }

}
