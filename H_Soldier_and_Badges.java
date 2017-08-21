/*

///H - Soldier and Badges
*/
import java.util.*;
import java.io.*;

public class H_Soldier_and_Badges {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

         
        int n = in.nextInt();
        int a[] = new int[n];
        int count = 0;
       
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] == a[j]) {
                    count++;
                    a[j]++;
                }
            }
        }
        System.out.println(count);
	}
}