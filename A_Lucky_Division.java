/*
A. Lucky Division
Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 
4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.

Input
The single line contains an integer n (1???n???1000) — the number that needs to be checked.

Output
In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).

Examples
input
47
output
YES
input
16
output
YES
input
78
output
NO
Note
Note that all lucky numbers are almost lucky as any number is evenly divisible by itself.

In the first sample 47 is a lucky number. In the second sample 16 is divisible by 4.

*/


import java.util.*;
import java.io.*;

public class A_Lucky_Division {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String n = in.next();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                count++;
            }
        }
        int parse = Integer.parseInt(n);
        if (count == n.length() || parse % 4 == 0 || parse % 7 == 0||parse % 47 == 0||parse % 744 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        } 

    }

}
