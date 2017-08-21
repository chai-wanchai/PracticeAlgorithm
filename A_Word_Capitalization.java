/*
Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. 
The length of the word will not exceed 103.

Output
Output the given word after capitalization.

Examples
input
ApPLe
output
ApPLe
input
konjac
output
Konjac
*/

import java.util.*;
import java.io.*;
public class A_Word_Capitalization {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String s = in.next();
        System.out.println((s.charAt(0)+"").toUpperCase()+s.substring(1));
        
    }

}
