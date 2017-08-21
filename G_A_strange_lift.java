/*



 */

import java.util.*;
import java.io.*;

public class G_A_strange_lift  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n[] = new int[3];
        while (true) {
            for (int i = 0; i < 3; i++) {
                n[i] = in.nextInt();
                if (n[0] == 0) {
                    return;
                }
            }
            LinkedList<Integer> k = new LinkedList<>();
            LinkedList<Integer> a = new LinkedList<>();
            k.addLast(n[1]);
            // int a[] = new int[n[0]];
            for (int i = 0; i < n[0]; i++) {
                a.add(in.nextInt());
            }
            int count = n[1];
            int i = 0;
            while (count <= n[2]) {
                int up = count + a.get(i);
                int down = count - a.get(i);
                if (up == n[2] || down == n[2]) {
                    System.out.println(k.size());
                    break;
                } else if (up >= 1 && up <= n[2]) {
                    count += a.get(i);

                } else if (down >= 1 && down <= n[2]) {
                    count -= a.get(i);

                }else {
                    System.out.println("-1");
                    break;
                }
                k.addLast(count);
                i = count - 1;

            }
           
            k.removeAll(k);

        }
    }

}


/*

queue<int> q;
q.push(1);
vis[1] = true;
while(!q.empty()){
    int a = q.front();
    q.pop();
    for(int i = 0; i < v[a].size(); ++i){
        int xx = v[a][i];
        if(!vis[xx]){
             vis[xx] = true;
            q.push(xx);
        }
    }
}


struct Node{
   int x, y;
};
dir[4][2] = {1, 0, 0, 1, -1, 0, 0, -1};
Node a,b;
queue<Node> q;
a.x = 0, a.y = 1;
q.push(a);
int num = 1;
vis[a.x][a.y] = true;
while(!q.empty()){
    b = q.front();
    q.pop();
    for(int i = 0; i < 4; ++i){
        int xx = b.x + dir[i][0];
        int yy = b.y + dir[i][1];
        if(xx >= 0 && xx < 4 yy >= 0 && yy < 4 && str[xx][yy] != '#' && !vis[xx][yy]){
            num++;
            a.x = xx, a.y = yy;
            vis[xx][yy] = true;
            q.push(a);
        }
    }
}

**/

////////////////////////////////////////////////////////////////
/********************       NEW*************************/
/*



 

import java.util.*;
import java.io.*;

public class Main {

    static void recur(int x, int y) {

    }
    static LinkedList<Integer> t[];
    static int diX[] = {-1, 0, 1, 0};
    static int diY[] = {0, -1, 0, 1};
    static int rr[] = new int[2];
    static int cc[] = new int[2];
    static boolean vis[][];
    static int r, c, count = 0;
    //static String s[];
    static char[][] cha;

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

        while (true) {
            int n[] = new int[3];
            for (int i = 0; i < 3; i++) {
                n[i] = in.nextInt();
                if (n[0] == 0) {
                    return;
                }
            }

            LinkedList<Integer> aa = new LinkedList<>();
            LinkedList<Integer> a = new LinkedList<>();
            aa.addLast(n[1]);

            for (int i = 0; i < n[0]; i++) {
                a.add(in.nextInt());
            }
            count = n[1];
            int i = 0;
            int num=1;
            while (true) {
                int up = count + a.get(i);
                int down = a.get(i) - count;
                
                if (count == n[2] ||up==n[2]||down==n[2]) {
                    System.out.println(num);
                    return;
                }
                if (up >= 1 && up < n[2]) {
                    
                    count+=a.get(i);
                    
                    aa.addLast(a.get(i));
                    i=a.get(count-1);
                    
                } else if (down >= 1 && down < n[2]) {
                    
                    count-=a.get(i);
                    aa.addLast(count);
                    
                }
                i = a.get(count - 1);
                System.out.println("i"+count);
                System.out.println("pop"+aa.size());
                //aa.pop();
                
                
                

            }

        }

    }

}


/*

**/
