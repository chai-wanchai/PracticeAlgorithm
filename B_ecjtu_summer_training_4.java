/////B =_ecjtu-summer training #4
import java.util.*;
import java.io.*;

public class B_ecjtu_summer_training_4 {

    static void re(long f) {
        int x = (int) Math.sqrt(f);
        count++;
        if (x != 1) {
           re(x);
        }

    }
    static int count = 0;
   
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
       
        
        int i=1;
        while (i<=120) {
            try {
                long n = in.nextLong();
                re(n);
                if (count > 5) {
                    System.out.println("TAT");
                } else {
                    System.out.println(count);
                }
                count=0;
                i++;
            } catch (Exception e) {
                System.out.println("TAT");
                //return;
                break;
                
            }

        }
	}
}