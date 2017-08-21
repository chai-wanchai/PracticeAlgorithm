#include <iostream>
#include <stdio.h>
#include <algorithm>
using namespace std;
const int maxn = 1e5+10;
struct Node{
    int x, y;
}T[maxn];
bool cmp(Node a, Node b){
    return a.x < b.x;
}
int a[maxn];
int main(){
    int n, xx = 1, yy = 1, num = 0;
    scanf("%d", &n);
    for(int i = 1; i <= n; ++i){
        scanf("%d", &a[i]);
        T[i].x = a[i], T[i].y = i;
   }
   	sort(T+1,T+1+n, cmp);
	bool flag = true;
   	for(int i = 1; i <= n; ++i){
   		if(T[i].x != a[i]){
   			if(num >= 2) return printf("no\n"), 0;
   			if(flag) xx = yy = T[i].y, flag = false;
			else if(T[i].y < yy){
				yy = T[i].y;
			}else{
				return printf("no\n"), 0;
			}
		}
		if(T[i].x == a[i] && !flag) num ++;
   }
   printf("yes\n%d %d", yy, xx);
   return 0;
}
