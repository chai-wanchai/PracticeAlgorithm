/*
B - Kalevitch and Chess
 */

import java.util.*;
import java.io.*;

public class B_Kalevitch_and_Chess {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        String str[] = new String[8];
        int count = 0;
        boolean vertical[] = new boolean[8];
        for (int i = 0; i < 8; i++) {
            str[i] = in.next();
            if ("BBBBBBBB".equals(str[i])) {
                count++;
            } else {
                for (int j = 0; j < 8; j++) {

                    if (str[i].charAt(j) == 'B' && !vertical[j]) {
                        vertical[j] = true;
                        count++;
                    }
                }
            }

        }
       
        System.out.println(count);

    }

}
