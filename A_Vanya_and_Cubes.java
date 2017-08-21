//A. Vanya and Cubes
/*
Vanya got n cubes. He decided to build a pyramid from them. 
Vanya wants to build the pyramid as follows: the top level of the pyramid must consist of 1 cube, 
the second level must consist of 1?+?2?=?3 cubes, the third level must have 1?+?2?+?3?=?6 cubes, 
and so on. Thus, the i-th level of the pyramid must have 1?+?2?+?...?+?(i?-?1)?+?i cubes.

Vanya wants to know what is the maximum height of the pyramid that he can make using the given cubes.

Input
The first line contains integer n (1?<=?n?<=?104) the number of cubes given to Vanya.

Output
Print the maximum possible height of the pyramid in the single line.

Examples
input
1
output
1
input
25
output
4

	$
    $$
	$$$$$
	$$$$$$$$$

*/

import java.util.*;
import java.io.*;

public class A_Vanya_and_Cubes {

    static int a[], sum;

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        a = new int[10000];

        for (int i = 1; i <= Math.pow(10, 4); i++) {
            a[i - 1] = i;

        }
        int num = 1;
        while (num <= 10000) {
            int sumX = 0;

            for (int i = 0; i < num; i++) {
                sumX += a[i];

            }

            sum += sumX;
            if (sum > n) {
                System.out.println(num - 1);
                return;
            }
            num++;

        }

    }

}
