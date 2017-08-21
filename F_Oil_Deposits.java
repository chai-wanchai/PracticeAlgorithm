/*
F - Oil Deposits 
The GeoSurvComp geologic survey company is responsible for detecting underground oil deposits. 
GeoSurvComp works with one large rectangular region of land at a time, and creates a grid that divides the land into numerous square plots. 
It then analyzes each plot separately, using sensing equipment to determine whether or not the plot contains oil. 
A plot containing oil is called a pocket. If two pockets are adjacent, then they are part of the same oil deposit. Oil deposits can be quite large 
and may contain numerous pockets. Your job is to determine how many different oil deposits are contained in a grid. 
Input
The input file contains one or more grids. Each grid begins with a line containing m and n, the number of rows and columns in the grid, 
separated by a single space. If m = 0 it signals the end of the input; otherwise 1 <= m <= 100 and 1 <= n <= 100. 
Following this are m lines of n characters each (not counting the end-of-line characters). Each character corresponds to one plot, and is either `*', 
representing the absence of oil, or `@', representing an oil pocket. 
Output
For each grid, output the number of distinct oil deposits. Two different pockets are part of the same oil deposit 
if they are adjacent horizontally, vertically, or diagonally. An oil deposit will not contain more than 100 pockets. 
Sample Input
1 1
*
3 5
*@*@*
**@**
*@*@*
1 8
@@****@*
5 5 
****@
*@@*@
*@**@
@@@*@
@@**@
0 0 
Sample Output
0
1
2
2

 */

import java.util.*;
import java.io.*;

public class F_Oil_Deposits  {

    public static void dfs(int x, int y) {
        visit[x][y] = true;
       
        
        for (int i = 0; i < 9; i++) {
            int xx = x + dX[i];
            int yy = y + dY[i];
            if (xx >= 0 && yy >= 0 && xx < m && yy < n && s[xx].charAt(yy)!='*' &&!visit[xx][yy]) {
                
                dfs(xx,yy);
            }
          
        }

    }
    static boolean visit[][] = new boolean[100][100];
    static int dX[] = {-1, -1, -1, 0, 1, 0, 1, 1, 1};
    static int dY[] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
    static int m,n,count=0;
    static String s[];
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
       
        while (true) {
			for (int i=0;i<100 ;i++ )
			{
				for (int j=0;j<100 ;j++ )
				{
					visit[i][j] =false;
				}
			}
            m = in.nextInt();
            n = in.nextInt();
            s = new String[m];
            ArrayList<Integer> r = new ArrayList();
            ArrayList<Integer> c = new ArrayList();
            if (m == 0 && n == 0) {
                return;
            }
            for (int i = 0; i < m; i++) {
                s[i] = in.next();

                for (int j = 0; j < n; j++) {
                    if (s[i].charAt(j) == '@') {
                        r.add(i);
                        c.add(j);
                    }
                }
            }
           
            for (int i = 0; i < r.size(); i++) {
                if (!visit[r.get(i)][c.get(i)]) {
                    dfs(r.get(i), c.get(i));
                    count++;
                }

                
            }
            System.out.println(count);
			count=0;

        }
    }

}
