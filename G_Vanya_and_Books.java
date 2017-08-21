/*
G - Vanya and Books 

*/
import java.util.*;
import java.io.*;

public class G_Vanya_and_Books  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
		long n = in.nextLong();
        in.close();
        
        long k=0;
        for (int i = 1; i <= n; i *= 10) {

            k = k + (n - i + 1);

        }
        System.out.print(k);
	}
}