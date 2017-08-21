/*

 */

import java.util.*;
import java.io.*;

public class E_Red_and_Black  {

    public static void dfs(int x, int y) {
        mark[x][y] = true;
        for (int j = 0; j < 4; j++) {
            int xx = x + di[j][0];
            int yy = y + di[j][1];

            if (xx >= 0 && xx < n && yy >= 0 && yy < m && s[xx].charAt(yy) == '.' && s[xx].charAt(yy) != '#' && !mark[xx][yy]) {
                count++;
                //System.out.println("count : " + count);
                dfs(xx, yy);
            }
        }
    }
    static boolean mark[][] = new boolean[100][100];
    static int di[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int count = 1;
    static String s[];
    static int m, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        while (true) {
            m = in.nextInt();
            n = in.nextInt();
            if (m == 0 && n == 0) {
                return;
            }

            int r = 0;
            int c = 0;
            s = new String[n];
            //int size = 0;
            for (int i = 0; i < n; i++) {
                s[i] = in.next();
                for (int j = 0; j < m; j++) {
                    if (s[i].charAt(j) == '@') {
                        r = i;
                        c = j;

                    }

                }

            }
           
            dfs(r, c);
            //System.out.println("ddd");

            System.out.println(count);
            count=1;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    mark[i][j]=false;
                }
            }
           
        }

    }

}
