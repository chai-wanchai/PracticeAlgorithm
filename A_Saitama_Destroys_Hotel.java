/*
A - Saitama Destroys Hotel 

http://codeforces.com/problemset/problem/608/A

*/
import java.util.*;
import java.io.*;

public class A_Saitama_Destroys_Hotel  {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int s = in.nextInt();
        int t[] = new int[n];
        int f[] = new int[n];
        int max=s;
        for (int i = 0; i < n; i++) {
            f[i] = in.nextInt();
            t[i] = in.nextInt();
            max = Math.max(max, f[i]+t[i]);
        }
        System.out.println(max);

    }

}
