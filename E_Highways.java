/*
The island nation of Flatopia is perfectly flat. Unfortunately, Flatopia has no public highways. So the traffic is difficult in Flatopia. 
The Flatopian government is aware of this problem. They're planning to build some highways so that it will be possible to drive between any pair of towns 
without leaving the highway system. 

Flatopian towns are numbered from 1 to N. Each highway connects exactly two towns. All highways follow straight lines. 
All highways can be used in both directions. Highways can freely cross each other, but a driver can only switch between highways at a town that is located 
at the end of both highways. 

The Flatopian government wants to minimize the length of the longest highway to be built. However, 
they want to guarantee that every town is highway-reachable from every other town.
Input
The first line of input is an integer T, which tells how many test cases followed. 
The first line of each case is an integer N (3 <= N <= 500), which is the number of villages. Then come N lines, 
the i-th of which contains N integers, and the j-th of these N integers is the distance (the distance should be an integer within [1, 65536]) 
between village i and village j. There is an empty line after each test case.
Output
For each test case, you should output a line contains an integer, which is the length of the longest road to be built such that all 
the villages are connected, and this value is minimum.
Sample Input
1

3
0 990 692
990 0 179
692 179 0
Sample Output
692
*/

import java.util.*;

public class E_Highways  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        // System.out.print("\n");
        while (T >= 1) {

            int n = in.nextInt();
            int a[][] = new int[n][n];
            int min = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();

                   
                }

            }
          
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[0][j] != 0) {
                        min = Math.min(min, a[i][j]);
                        if (a[0][n - 1] == min) {
                            ans = a[0][n - 1];
                            System.out.println(ans);
                            return;
                        }
                        
                    }
                }
            }
            if (a[0][n - 1] != min) {
                ans = 0;
                for (int k = 0; k < n - 1; k++) {
                    ans += a[0][k];
                    //System.out.println("ans"+ans);
                }
            }
            System.out.println(ans);
            System.out.print("\n");
            T--;
        }
    }
}
