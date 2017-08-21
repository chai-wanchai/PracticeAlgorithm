/*

http://codeforces.com/problemset/problem/580/C
*/

import java.util.*;

import java.io.*;

public class D_Kefa_and_Park {

    static ArrayList<Integer>[] con;
    static int a[];
    static int m,n;
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        n = in.nextInt();
        m = in.nextInt();
        con = new ArrayList[n];
        a = new int[n];

        for (int i = 0; i < n; i++) {
            con[i] = new ArrayList<Integer>();

        }
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            con[x].add(y);
            con[y].add(x);
        }
       
        System.out.println(dfs(0,0));
      

    }

    public static int dfs(int idx, int seen) {
        seen = (seen + a[idx]) * a[idx];
        if (seen > m) {
            return 0;
        }
        if (con[idx].isEmpty()) {
            return 1;
        }
        int total = 0;
        for (Integer i : con[idx]) {
            con[i].remove((Integer) idx);
            total += dfs(i, seen);
        }
        return total;
    }

}
