/*
B - Hangman Judge
 */

import java.util.*;
import java.io.*;

public class  B_Hangman_Judge{

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
         String s;
        String q;
        //int count = 0;
        int a[] = new int[26];
        int round;
        int Wrong = 0, len = 0;
        while (true) {
            for (int i = 0; i < 26; i++) {
                a[i] = 0;
            }
            round = in.nextInt();
            if (round == -1) {
                return;
            }
            s = in.next().toLowerCase();
            q = in.next();

            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'a']++;
            }
            Wrong = 0;
            len = 0;
            for (int i = 0; i < q.length(); i++) {
                if (a[q.charAt(i) - 'a'] == 0) {
                    Wrong++;
                } else if (a[q.charAt(i) - 'a'] > 0) {
                    len = len + a[q.charAt(i) - 'a'];
                    a[q.charAt(i) - 'a'] = 0;
                }
               if(len == s.length()) break;
            }
            System.out.println("Round " + round);
            if (Wrong >= 7) {
                System.out.println("You lose.");
            } else if (len == s.length()) {
                System.out.println("You win.");
            } else {
                System.out.println("You chickened out.");
            }


            /*for (int j = 0; j < s.length(); j++) {
                if (q.contains(s.subSequence(j, j + 1))) {
                    count++;
                    //System.out.println(count);
                } else {

                }
            }
            if (count == s.length()) {
                System.out.println("Round " + round);
                System.out.println("You win.");

            } else if (count < s.length() && q.length() > 7) {
                System.out.println("Round " + round);
                System.out.println("You lose.");
            } else {
                System.out.println("Round " + round);
                System.out.println("You chickened out.");
            }
            count = 0;*/
        }

    }

}
