/*  Find symbol that max adjacent with other position 
4 4
####
***#
**#*
####

4 4
#*#*
*#*#
#*#*
*#*#

a[0] = 1, b[0] = 0; str[1][0]
a[1] = 1, b[1] = 1; str[1][1]
a[2] = 1, b[2] = 2; str[1][2]
a[3] = 2, b[3] = 0; str[2][0]
a[4] = 2, b[4] = 1; str[2][4]
a[5] = 2, b[5] = 3; str[2][5]


vis[][]
*/
#include <iostream>
using namespace std;
char str[10][10];
int a[10], b[10], num = 0, sum = 0, ma = -1, n, m;
bool vis[10][10];
int dir[4][2] = {1, 0, 0, 1,  -1, 0,  0, -1};
void dfs(int x, int y){
	vis[x][y] = true;
	for(int i = 0; i < 4; ++i){
		int xx = x + dir[i][0];
		int yy = y + dir[i][1];
		cout<<i<<"**"<<xx<<"&&"<<yy<<endl;
		if(xx >= 0 && xx < n && yy >= 0 && yy < m && str[xx][yy] == '*' && !vis[xx][yy]){
			cout<<xx<<"**"<<yy<<endl;
			sum ++;
			dfs(xx, yy);
		}
	}
}
int main(){
	scanf("%d%d", &n, &m);
	for(int i = 0; i < n; ++i){
		scanf("%s", str[i]);
		for(int j = 0; j < m; ++j){
			if(str[i][j] == '*'){
				a[num] = i, b[num] = j, num++;
			}
		}
	}
	for(int i = 0; i < num; ++i){
		//cout<<a[i]<<"&&&&"<<b[i]<<endl;
		if(!vis[a[i]][b[i]]){
			//sum++;
			//cout<<a[i]<<"*****************"<<b[i]<<endl;
			sum = 1;
			dfs(a[i], b[i]);
			ma = max(ma, sum);
		}
	}
	printf("%d\n", ma);
	return 0;
}
