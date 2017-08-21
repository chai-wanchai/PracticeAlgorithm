/*
G - Maze
https://cn.vjudge.net/contest/168268#problem/G

 */

import java.util.*;
import java.io.*;

public class G_Maze {

	static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + diX[i];
            int yy = y + diY[i];
            if (xx >= 0 && xx < n && yy >= 0 && yy < m && !visit[xx][yy] && s[xx].charAt(yy) == '.') {
                countFind++;
                dfs(xx, yy);
            }
            if (countVis == countFind + 1) {
                return;
            }
        }

    }
    static boolean visit[][] = new boolean[500][500];
    static int n, m, countVis = 0, countFind = 0;
    static int diX[] = {0, -1, 0, 1};
    static int diY[] = {-1, 0, 1, 0};
    static char c[][];
    static String s[];
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        n = in.nextInt();
        m = in.nextInt();
        int k = in.nextInt();
        s = new String[n];
        //c = new char[n][m];
        int y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
            for (int j = 0; j < m; j++) {
                if (s[i].charAt(j) == '.') {
                    countVis++;
                    y = i;
                    z = j;
                }
            }
        }
        countVis -= k;
        dfs(y, z);
        String sk = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s[i].charAt(j) == '.' && !visit[i][j]) {
                    sk += 'X';
                }else{
                    sk+=s[i].charAt(j);
                }
               
            }
            sk += "\n";
        }
        System.out.println(sk);

    }

}
