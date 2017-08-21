import java.util.*;
import java.io.*;

public class Contest_RobotDoJob {


    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int q = in.nextInt();
        int ans=n;
        int count=0;
        while (ans>=0) {            
            ans =ans-q;
            q++;
            count++;
        }
        System.out.println(count);
      
        

    }

}