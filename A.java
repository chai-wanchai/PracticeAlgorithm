import java.util.*;
import java.io.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int y = in.nextInt();
        int ans = 0;
        int numDays = 0;
        if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) {
            numDays = 366;
        } else {
            numDays = 365;
        }

        int day = numDays % 7;  
        int year = y + 1;
        while (true) {
            int d = (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? 366 : 365;
            if (day == 0 && d == numDays) {
                break;
            }

            year++;
            day += d % 7;
            day %= 7;
        }
        System.out.println(year);


    }

}
