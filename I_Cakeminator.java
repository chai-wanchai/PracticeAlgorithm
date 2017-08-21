/*
I - Cakeminator
You are given a rectangular cake, represented as an r???c grid. Each cell either has an evil strawberry, or is empty. 
For example, a 3???4 cake may look as follows:
The cakeminator is going to eat the cake! Each time he eats, he chooses a row or a column that does not contain any evil 
strawberries and contains at least one cake cell that has not been eaten before, and eats all the cake cells there. He may decide to eat any number of times.

Please output the maximum number of cake cells that the cakeminator can eat.

Input
The first line contains two integers r and c (2???r,?c???10), denoting the number of rows and the number of columns of the cake. 
The next r lines each contains c characters — the j-th character of the i-th line denotes the content of the cell at row i and column j, 
and is either one of these:

'.' character denotes a cake cell with no evil strawberry;
'S' character denotes a cake cell with an evil strawberry.
Output
Output the maximum number of cake cells that the cakeminator can eat.

Example
Input
3 4
S...
....
..S.
Output
8
Note
For the first example, one possible way to eat the maximum number of cake cells is as follows (perform 3 eats).
*/
import java.util.*;
import java.io.*;

public class I_Cakeminator {

    public static void main(String[] args) {
       Scanner in = new Scanner(new InputStreamReader(System.in));
       // ArrayList<Integer> s1 = new ArrayList<>();
        //ArrayList<Integer> s2 = new ArrayList<>();
       HashSet<Integer> s1 = new HashSet<Integer>(), s2 = new HashSet<Integer>();
        int n = in.nextInt(), m = in.nextInt();
        char s[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            s[i] = in.next().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s[i][j] == 'S') {
                    s1.add(i);
                    s2.add(j);
                }
            }
        }
        System.out.println(n * m - s1.size() * s2.size());
    }

   
   

}
