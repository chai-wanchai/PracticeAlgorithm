/*
F - Round House 

 */

import java.util.*;
import java.io.*;

public class  F_Round_House  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(((a-1+b)%n+n)%n+1);
      
    }
}
