
import java.util.Scanner;

public class DelAlphabet{

    public static void main(String[] args) {
        
       char[] a = {'a', 'o', 'y', 'e', 'u', 'i'};
       boolean[] vis = new boolean[100];
       
       
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next().toLowerCase();
       
         for (int i = 0; i < str.length(); i++) {
             for (int j = 0; j < a.length; j++) {
                if (str.charAt(i) == a[j]) {
                    vis[i] = true;
                    
                } 
			}
        }
        for (int i = 0; i < str.length(); i++) {
            if(!vis[i])
              System.out.print("."+str.charAt(i));
                
        }
        

    }

   
}
