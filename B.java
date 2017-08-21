import java.util.*;
import java.io.*;

public class B {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int a[][] = new int[n][2];
        int man[] = new int[100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = in.nextInt();
                
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                //System.out.println("i:"+i + " J:"+j);
                int m = Math.abs(a[i][0] - a[j][0]) + Math.abs(a[i][1] - a[j][1]);
                System.out.println("a["+i+"]:"+a[i][0]+"a["+j+"]:"+a[j][0]);
            }
                
            
            
        }
    }
    
}
