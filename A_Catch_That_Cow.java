import java.util.*;
import java.io.*;

public class A_Catch_That_Cow  {

    static int bfs(int n, int k) {
        qu[0] = n;
        des[n] = 0;
        int aux ;

        while(true) {
            aux = qu[start];
            start++;
            

            if (aux == k) {
                return des[aux];
            }

            if (aux > 0 && des[aux - 1] == -1) {
                qu[end++] = aux - 1;
                des[aux - 1] = des[aux] + 1;
            }

            if (aux < 100000 && des[aux + 1] == -1) {
                qu[end++] = aux + 1;
                des[aux + 1] = des[aux] + 1;
            }

            if (2 * aux < 100000 && des[2 * aux] == -1) {
                qu[end++] = 2 * aux;
                des[2 * aux] = des[aux] + 1;
            }
        }
       
        

    }
  
    static int count = 0, qu[], des[], start = 0, end = 1;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int k = in.nextInt();
        qu = new int[100000];
        des = new int[100000];
        for (int i = 0; i < 100000; i++) {
            des[i]=-1;
        }
        if (k <= n) {
            System.out.println(n - k);
        } else {
            System.out.println(bfs(n, k));
            
        }

    }

}
