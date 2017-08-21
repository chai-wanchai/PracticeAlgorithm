/*
The translation from the Berland language into the Birland language is not an easy task. Those languages are very similar: 
a berlandish word differs from a birlandish word with the same meaning a little: it is spelled (and pronounced) reversely. 
For example, a Berlandish word code corresponds to a Birlandish word edoc. However, it's easy to make a mistake during the translation. 
Vasya translated word s from Berlandish into Birlandish as t. Help him: find out if he translated the word correctly.

Input
The first line contains word s, the second line contains word t. The words consist of lowercase Latin letters. 
The input data do not consist unnecessary spaces. The words are not empty and their lengths do not exceed 100 symbols.

Output
If the word t is a word s, written reversely, print YES, otherwise print NO.

Examples
input
code
edoc
output
YES
input
abb
aba
output
NO
input
code
code
output
NO

*/
import java.util.*;
import java.io.*;

public class A_Translation {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String s1 = in.next();
        String s2 = in.next();

        if (s1.length() == s2.length()) {
            int size1 = s2.length() - 1;
            int i = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(size1)) {
                    i++;

                }

                size1--;
            }
            if (i == s1.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }

}
