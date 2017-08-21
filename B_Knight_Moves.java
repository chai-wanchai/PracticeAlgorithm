/*



 */

import java.util.*;
import java.io.*;

public class B_Knight_Moves {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        while (true) {
            String s[] = new String[2];

            s[0] = in.next();
            s[1] = in.next();
            if (s[0].charAt(0) == s[1].charAt(0)) {
                //int x =Character.getNumericValue(s[0].charAt(0))-Character.getNumericValue('a');
                int y1 = Character.getNumericValue(s[0].charAt(1));
                int y2 = Character.getNumericValue(s[1].charAt(1));
                int ans = (int) Math.abs(y1 - y2);
                System.out.printf("To get from %s to %s takes %d knight moves.\n",s[0],s[1],ans);
            }else{
                
            
            }

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
