/*
J - Queue

*/

import java.util.*;
import java.io.*;

public class J_Queue {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int a[] = new int[n];
        int temp=0;
        int index[] = new int[n];
		
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
			
        }
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            if (i< n -1 && a[i+1]-a[i] >temp) {
                index[i]=a[i+1]-a[i];
                
            }
            
        }
        for (int i = 0; i < n-1; i++) {
            if (index[i]!=index[i+1]) {
                System.out.println(a[index[i+1]]+1);
                break;
            }
           
        }
	}
}