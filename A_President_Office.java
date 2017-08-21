/*
A - President's Office 


*/



import java.util.*;
import java.io.*;

public class A_President_Office  {

    static boolean mark[][] = new boolean[100][100];
    static int[][] direc = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int n, m;
    //static int count = 0;
    static String str[];
    static char c;
   // static int max = 0;
    static HashSet<Character> ar = new HashSet<Character>();

    public static void dfs(int x, int y) {
        mark[x][y] = true;
        for (int i = 0; i < 4; ++i) {
            int xx = x + direc[i][0];
            int yy = y + direc[i][1];

            if (xx >= 0 && xx < n && yy >= 0 && yy < m && !mark[xx][yy] && str[xx].charAt(yy) != '.' && str[xx].charAt(yy) != c) {
                
                ar.add(str[xx].charAt(yy));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        n = in.nextInt();
        m = in.nextInt();
        c = in.next().toUpperCase().charAt(0);
        str = new String[n];
       // int row[] = new int[500], col[] = new int[500];
        ArrayList<Integer> Row = new ArrayList<Integer>();
        ArrayList<Integer> Col = new ArrayList<Integer>();
        int z = 0;
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
            for (int j = 0; j < m; j++) {
                if (str[i].charAt(j) == c) {
                   // row[z] = i;
                    //col[z] = j;
                    Row.add(i);
                    Col.add(j);
                    z++;
                }
            }

        }

        for (int i = 0; i < z; i++) {
            if (!mark[Row.get(i)][Col.get(i)]) {
           
               // dfs(row[i], col[i]);
                dfs(Row.get(i), Col.get(i));
            }

        }
       
       
        System.out.println(ar.size());

    }

}
