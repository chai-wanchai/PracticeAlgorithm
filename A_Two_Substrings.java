/*
A - Two Substrings 
 */

import java.util.*;

public class A_Two_Substrings  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.length() == 1) {
            System.out.println("NO");
            return;
        }

        if (str.contains("AB")&&str.substring(str.indexOf("AB")+2).contains("BA") || str.contains("BA")&&str.substring(str.indexOf("BA")+2).contains("AB")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
