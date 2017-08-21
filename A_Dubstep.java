/*
Input
The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length doesn't exceed 200 characters. 
It is guaranteed that before Vasya remixed the song, no word contained substring "WUB" in it; Vasya didn't change the word order. 
It is also guaranteed that initially the song had at least one word.

Output
Print the words of the initial song that Vasya used to make a dubsteb remix. Separate the words with a space.

Examples
input
WUBWUBABCWUB
output
ABC 
input
WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB
output
WE ARE THE CHAMPIONS MY FRIEND 
Note
In the first sample: "WUBWUBABCWUB" = "WUB" + "WUB" + "ABC" + "WUB". That means that the song originally consisted of a single word "ABC", 
and all words "WUB" were added by Vasya.

In the second sample Vasya added a single word "WUB" between all neighbouring words, in the beginning and in the end, except for words "ARE" 
and "THE" — between them Vasya added two "WUB".
*/
import java.util.*;
import java.io.*;
public class A_Dubstep {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String s = in.next();
        in.close();
        if (s.contains("WUB")) {
            String ss = s.replace("WUB", " ").trim();
            System.out.println(ss);
        }else{
            System.out.println(s);
        }

    }

}
