
import java.util.*;
import java.io.*;

public class D_NewYear_and_OldProperty  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        long n = in.nextLong();
        long m = in.nextLong();
        in.close();
        int count = 0;
        for (long i = 1; i <= 60; i++) {
            for (int j = 0; j < i-1; j++) {
                
                long v = ((1L << i) - 1L) ^ (1L << j);
                if (n <= v && m >= v) {
                    count++;
                }
            }

        }
        System.out.println(count);

    }

}