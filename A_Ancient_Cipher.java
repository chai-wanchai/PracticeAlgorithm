/*
A - Ancient Cipher

 */

import java.util.*;
import java.io.*;

public class A_Ancient_Cipher {

    public static void main(String[] args) {
        String origin;
        String encrypt;
        
            Scanner in = new Scanner(new InputStreamReader(System.in));
            while(in.hasNext()){
            encrypt = in.nextLine().toUpperCase();
            origin = in.nextLine().toUpperCase();
            int len = encrypt.length();
            int a[] = new int[26];
            int b[] = new int[26];
            boolean flag = false;
            for(int i = 0; i < len; ++i){
                a[encrypt.charAt(i)-'A']++;
                b[origin.charAt(i)-'A']++;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i = 0; i < 26; ++i){
                if(a[i] != b[i]){
                    flag = true;
                    break;
                }
            }
          
           if(!flag) System.out.println("YES");
           else System.out.println("NO");
          }
    

    }

}
