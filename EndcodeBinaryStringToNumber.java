
import java.util.Scanner;

public class EndcodeBinaryStringToNumber{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
       
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i)=='1') {
                c++;
            }else{
                System.out.print(c);
                c=0;
            }
            
        }System.out.print(c);
        
        
    }
}
