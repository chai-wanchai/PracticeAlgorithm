/*
F - Soldier and Cards
*/
import java.util.*;
import java.io.*;

public class F_Soldier_and_Cards {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int k[] = new int[2];
        k[0] = in.nextInt();
        LinkedList<Integer> a = new LinkedList();
        LinkedList<Integer> b = new LinkedList();

        for (int i = 0; i < k[0]; i++) {
            a.addLast(in.nextInt());
        }
        k[1] = in.nextInt();
        for (int i = 0; i < k[1]; i++) {
            b.addLast(in.nextInt());
        }
        int limit= 100000;
        int i;
        for (i = 0; i < limit; i++) {
            if (a.isEmpty()) {
                System.out.println(i+" 2");
                return;
            }
            if (b.isEmpty()) {
                System.out.println(i+" 1");
                return;
            }
            int a1 = a.removeFirst();
            int b1 = b.removeFirst();
           //System.out.println(a1 +" ||"+ b1);
            if (a1<b1) {
                b.addLast(a1);
                b.addLast(b1);
            } else {
                a.addLast(b1);
                a.addLast(a1);
            }
            
            
        }
        System.out.println("-1");

    }

}
