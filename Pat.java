import java.util.*;
public class  Main
{
	public static void main(String[] args) 
	{
		
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int num = n;
	for(int i = 0; i <= n; ++i){
		int x = 0;
		for(int j = 0; j <= i+n; ++j){
			if(j < num) System.out.print(" ");
			else if(j <= n) System.out.print(x++);
			else System.out.print(--x);
			if(j == n) x--;
			if(j != i+n) System.out.print(" ");
			else System.out.println();
		}
		num--;
	}
	num = 1;
	for(int i = n-1; i >= 0; --i){
		int x = 0;
		for(int j = 0; j <= i+n; ++j){
			if(j < num) System.out.print(" ");
			else if(j <= n) System.out.print(x++);
			else System.out.print(--x);
			if(j == n) x--;
			if(j != i+n) System.out.print(" ");
			else System.out.println();
		}
		 
		num++;
	}
		//System.out.println("Hello World!");
	}
}
