/*
A. George and Accommodation
George has recently entered the BSUCP (Berland State University for Cool Programmers). 
George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it 
and the room can accommodate qi people in total (pi???qi). Your task is to count how many rooms has free place for both George and Alex.

Input
The first line contains a single integer n (1???n???100) — the number of rooms.

The i-th of the next n lines contains two integers pi and qi (0???pi???qi???100) 
the number of people who already live in the i-th room and the room's capacity.

Output
Print a single integer — the number of rooms where George and Alex can move in.

Examples
input
3
1 1
2 2
3 3
output
0
input
3
1 10
0 10
10 10
output
2
*/
import java.util.*;
import java.io.*;

public class A_George_and_Accommodation {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        int p[] = new int[n];
        int q[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
            q[i] = in.nextInt();
            if (p[i] < q[i] && q[i] - p[i] >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
