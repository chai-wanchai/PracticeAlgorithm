/*
A. Amr and Music

Amr is a young coder who likes music a lot. He always wanted to learn how to play music but he was busy coding so he got an idea.

Amr has n instruments, it takes ai days to learn i-th instrument. Being busy, Amr dedicated k days to learn how to play the maximum possible number of instruments.

Amr asked for your help to distribute his free days between instruments so that he can achieve his goal.

Input
The first line contains two numbers n, k (1???n???100, 0???k???10?000), the number of instruments and number of days respectively.

The second line contains n integers ai (1???ai???100), representing number of days required to learn the i-th instrument.

Output
In the first line output one integer m representing the maximum number of instruments Amr can learn.

In the second line output m space-separated integers: the indices of instruments to be learnt. You may output indices in any order.

if there are multiple optimal solutions output any. It is not necessary to use all days for studying.

*/
import java.util.*;
import java.io.*;

public class AE_Amr_and_Music {

    public static void main(String[] args) {
        Scanner s = new Scanner(new InputStreamReader(System.in));
        int n = s.nextInt();
        int k = s.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int count;

        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }
        s.close();
        b.addAll(a);
        Collections.sort(b);
        int br = 0;
        for (count = 0; count < n; count++) {
            br += b.get(count);
            if (br > k) {
                break;
            }
        }
        System.out.println(count);
        for (int i = 0, m; i < count; i++) {
            m = a.indexOf(b.get(i));
            System.out.print(m + 1 + " ");
            a.set(m, 0);
        }
        
    }
}



#include <iostream>
using namespace std;
int main(){
	int n;
	scanf("%d", &n);
	int num = n;
	for(int i = 0; i <= n; ++i){
		int x = 0;
		for(int j = 0; j <= i+j; ++j){
			if(j < num) printf(" ");
			else if(j <= n) printf("%d ", x++);
			else printf("%d ", x--);
			if(x == n) x--;
		}
		num--;
	}
	return 0;
}