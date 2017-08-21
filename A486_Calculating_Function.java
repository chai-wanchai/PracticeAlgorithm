import java.util.*;
import java.io.*;


public class A486_Calculating_Function {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(new InputStreamReader(System.in));
        long n = in.nextLong();

        long g = n / 2;
        if (n % 2 == 0) {
            System.out.println(g);
        } else {
            System.out.println(g - n);
        }
	}
}