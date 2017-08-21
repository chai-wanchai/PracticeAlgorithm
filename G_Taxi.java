/*
G - Taxi 
After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. 
We know that the i-th group consists of si friends (1<=si<=?4), and they want to go to Polycarpus together. 
They decided to get there by taxi. Each car can carry at most four passengers. 
What minimum number of cars will the children need 
if all members of each group should ride in the same taxi (but one taxi can take more than one group)
----------Input---------------
The first line contains integer n (1<=n<=105) — the number of groups of schoolchildren. 
The second line contains a sequence of integers s1,s2,...,sn (1???si???4). 
The integers are separated by a space, si is the number of children in the i-th group.
------------------------------
---------Output-------------
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.
--------------------------
*/
import java.util.Scanner;

public class G_Taxi {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x;
        int count = 0, l = 0;
        int s[] = new int[5];
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            s[x]++;
        }
        System.out.println(s[4]+s[3]+s[2]/2+(s[2]%2*2+Integer.max(0,s[1]-s[3])+3)/4);
       
    }
}
