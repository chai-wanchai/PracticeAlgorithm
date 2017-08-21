import java.util.*;
import java.io.*;

public class C_Ice_Cave {

    static boolean recur(int x, int y) {
        vis[x][y] = true;
        cha[x][y] = 'X';
        for (int i = 0; i < 4; i++) {
            int xx = x + diX[i];
            int yy = y + diY[i];
            if (xx >= 0 && yy >= 0 && xx < r && yy < c) {
               
                if (xx == rr[1] && yy == cc[1] && cha[xx][yy] == 'X') {
                    return true;
                } else if (cha[xx][yy] != 'X' && vis[xx][yy] == false) {
                    if (recur(xx, yy)) {
                        
                        return true;
                    }
                }

            }
        }
        return false;

    }
    static LinkedList<Integer> t[];
    static int diX[] = {-1, 0, 1, 0};
    static int diY[] = {0, -1, 0, 1};
    static int rr[] = new int[2];
    static int cc[] = new int[2];
    static boolean vis[][];
    static int r, c;
   
    static char[][] cha;

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

        r = in.nextInt();
        c = in.nextInt();
       
        vis = new boolean[r][c];
        cha = new char[1000][];
        for (int i = 0; i < r; i++) {
            cha[i] = in.next().toCharArray();

        }

        for (int i = 0; i < 2; i++) {
            rr[i] = in.nextInt()-1;
            cc[i] = in.nextInt()-1;
        }
        boolean ans = recur(rr[0], cc[0]);
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}