/*
C - Pangram 
A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once. 
Pangrams are often used to demonstrate fonts in printing or test the output devices.

You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. 
We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.

Input
The first line contains a single integer n (1???n???100) — the number of characters in the string.

The second line contains the string. The string consists only of uppercase and lowercase Latin letters.

Output
Output "YES", if the string is a pangram and "NO" otherwise.

Example
Input
12
toosmallword
Output
NO
Input
35
TheQuickBrownFoxJumpsOverTheLazyDog
Output
YES
*/
import java.io.*;
public class C_Pangram  {

    public static void main(String[] args) throws IOException {
        int count=0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine()) ;
            String s = in.readLine().toLowerCase();//System.out.println(s);
            in.close();
            //count = 0;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.contains(String.valueOf(ch))) {
                    count++;
                }
            }
            
        }

        if (count >= 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}