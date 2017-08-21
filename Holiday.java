
import java.util.*;
import java.io.*;

public class Holiday {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int max, min;
        max = n / 7 * 2 + Math.min(n % 7, 2);
        min = n / 7 * 2 + Math.max(0, n % 7 - 5);
        System.out.println(min + " " + max);
       

    }

}
