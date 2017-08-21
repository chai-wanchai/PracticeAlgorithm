
import java.util.Scanner;

public class E_PetyaAndStrings  {

    public static void main(String[] args) {
      /*  Compare String */
        String strFirst;
        String strSecond;
        Scanner in = new Scanner(System.in);
        strFirst =  in.next().toLowerCase();
        strSecond = in.next().toLowerCase();
        if (strFirst.compareTo(strSecond)==0) {
            System.out.println(0);
        }else if(strFirst.compareTo(strSecond)<0){
            System.out.println(-1);
        }else if(strFirst.compareTo(strSecond)>0){
            System.out.println(1);
        }
        
    }
}
