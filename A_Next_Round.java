import java.util.Scanner;

public class A_Next_Round {

    public static void main(String[] args) {
        int n, k, p,count=0;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        int a[] = new int[n];
        if (k >= 1 && k <= n && n <= 50) {
            for (int i = 0; i < n; i++) {
                p = in.nextInt();
                while (p >= 0 && p <= 100) {
                    a[i] = p;
                    p = -1;
                }
            }
            for (int i = 0; i < n; i++) {
                
                if (a[i]>=a[k-1]&&a[i]>0) {
                    count++;
                   
                }
            
            }
            System.out.print(count);
            
        }

    }
}
