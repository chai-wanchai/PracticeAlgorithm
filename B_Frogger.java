/*

B - Frogger
Freddy Frog is sitting on a stone in the middle of a lake. Suddenly he notices Fiona Frog who is sitting on another stone. 
He plans to visit her, but since the water is dirty and full of tourists' sunscreen, he wants to avoid swimming and instead reach her by jumping. 
Unfortunately Fiona's stone is out of his jump range. Therefore Freddy considers to use other stones as intermediate stops 
and reach her by a sequence of several small jumps. 
To execute a given sequence of jumps, a frog's jump range obviously must be at least as long as the longest jump occuring in the sequence. 
The frog distance (humans also call it minimax distance) between two stones therefore is defined as the minimum necessary jump range over all 
possible paths between the two stones.

You are given the coordinates of Freddy's stone, Fiona's stone and all other stones in the lake. Your job is to compute the frog distance 
between Freddy's and Fiona's stone. 
Input
The input will contain one or more test cases. The first line of each test case will contain the number of stones n (2<=n<=200). 
The next n lines each contain two integers xi,yi (0 <= xi,yi <= 1000) representing the coordinates of stone #i. Stone #1 is Freddy's stone, 
stone #2 is Fiona's stone, the other n-2 stones are unoccupied. There's a blank line following each test case. 
Input is terminated by a value of zero (0) for n.
Output
For each test case, print a line saying "Scenario #x" and a line saying "Frog Distance = y" where x is replaced by the test case number 
(they are numbered from 1) and y is replaced by the appropriate real number, printed to three decimals. 
Put a blank line after each test case, even after the last one.
Sample Input
2
0 0
3 4

3
17 4
19 4
18 5

0
Sample Output
Scenario #1
Frog Distance = 5.000

Scenario #2
Frog Distance = 1.414

*/
import java.util.Scanner;

public class B_Frogger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseT =1;
        while (true) {

            int n = in.nextInt();
            if (n==0) {
                return;
            }
            int x[] = new int[n];
            int y[] = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();

            }
            int xS = x[0];
            int yS = y[0];
            double min = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {

                double dis = Math.sqrt(Math.pow(xS - x[i], 2) + Math.pow(yS - y[i], 2));
                //System.out.println("dis:"+dis);
                min = Math.min(min, dis);
            }
            System.out.println("Scenario #"+caseT);
            System.out.printf("Frog Distance = %.3f",min);
            System.out.println("\n");
            caseT++;
        }

    }
}
