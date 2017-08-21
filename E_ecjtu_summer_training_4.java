///E
import java.util.*;
import java.io.*;

public class E_ecjtu_summer_training_4 {

   static void dfs(int x, int y) {
        vis[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            
            if (xx >= 0 && yy >= 0 && xx < h && yy < w && s[xx].charAt(yy) != '#' && !vis[xx][yy]) {
                
                count++;
                dfs(xx, yy);
            }
        }
    }
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static boolean vis[][] = new boolean[20][20];
    static int w, h, count = 1;
    static String s[];

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int cas = in.nextInt();
        for (int i = 0; i < cas; i++) {
            w = in.nextInt();
            h = in.nextInt();
            s = new String[h];
            int r = 0, c = 0;
            for (int j = 0; j < h; j++) {
                s[j] = in.next();

                if (s[j].contains("@")) {
                    r = j;
                    c = s[j].indexOf("@");
                   
                }
            }
            dfs(r, c);
            System.out.println("Case "+(i+1)+": "+count);
            count = 1;
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    vis[j][k] = false;
                }
            }
        }
	}
}