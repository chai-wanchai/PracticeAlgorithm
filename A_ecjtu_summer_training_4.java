///A

import java.util.*;
import java.io.*;

public class A_ecjtu_summer_training_4 {


    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n= in.nextInt();
        int H1[] = new int[n];
        int M1[] = new int[n];
        int S1[] = new int[n];
        int H2[] = new int[n];
        int M2[] = new int[n];
        int S2[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            H1[i] = in.nextInt();
            M1[i] = in.nextInt();
            S1[i] = in.nextInt();
            H2[i] = in.nextInt();
            M2[i] = in.nextInt();
            S2[i] = in.nextInt();
            
           
        }
        for (int i = 0; i < n; i++) {
            if (H1[i]<H2[i]) {
                System.out.println("Player1");
            }else if (H1[i]>H2[i]) {
                System.out.println("Player2");
            }else if(H1[i]==H2[i]){
                if (M1[i]==M2[i]) {
                    if (S1[i]==S2[i]) {
                        System.out.println("Tie");
                    }else if (S1[i]>S2[i]) {
                        System.out.println("Player2");
                    }else if(S1[i]<S2[i]){
                        System.out.println("Player1");
                    }
                    
                }else if (M1[i]>M2[i]) {
                    System.out.println("Player2");
                }else if (M1[i]<M2[i]) {
                    System.out.println("Player1");
                }
                
            }
        }
   
    }

}