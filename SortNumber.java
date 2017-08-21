import java.util.Scanner;
class SortNumber 
{
	public static void main(String[] args) 
	{
		int n;
       
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            
        }
         for (int i = 1; i < n; i++) {
            if ((i>0)&&(arr[i]<arr[i-1])) {                
                arr[i]=arr[i-1];
                i++;
            }
            
        }
        for (int i = 0; i < n; i++) {
            
            System.out.print(arr[i] +" ");
        }
        
	}
}
