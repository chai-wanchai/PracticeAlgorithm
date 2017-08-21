/*


*/
import java.util.*;
import java.io.*;

public class A_summer_training {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int a[] = new int[2];
        a[0] = in.nextInt();
        a[1]= in.nextInt();
        int count=0;
        do{
            a[0]+=1;
            a[1]-=2;
            count++;
            if (count%2==0) {
                
            }
            
            System.out.println(a[0]);
        } while (a[0]==0 || a[1]==0) ;
    }

}
