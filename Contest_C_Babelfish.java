/*


 */

import java.util.*;
import java.io.*;

public class Contest_C_Babelfish {

    public Contest_C_Babelfish(String Eng, String For) {
        this.Eng = Eng;
        this.For = For;
    }
    String Eng;
    String For;

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList();
        Map<Integer, Contest_C_Babelfish> dic = new Hashtable<Integer, Contest_C_Babelfish>();
        int i = 0;

        while (true) {
            String d = in.nextLine();

            if (d.isEmpty()) {
               // System.out.println("----------");
                break;

            } else {
                String a[] = d.split("\\s+");
                dic.put(i, new Contest_C_Babelfish(a[0], a[1]));
                i++;
            }

        }
        
        while (true) {
            i=0;
            String next = in.next();
            
            for (Map.Entry<Integer, Contest_C_Babelfish> entry : dic.entrySet()) {
                Integer key = entry.getKey();
                Contest_C_Babelfish value = entry.getValue();
                if (next == null ? value.For == null : next.equals(value.For)) {
                    System.out.println(value.Eng);
                    break;
                }else{
                    i++;
                }
                if (i==dic.size()) {
                    System.out.println("eh");
                }
                     
            }
           
        }
        

    }

}
//////////////Main///////////////
/*



import java.util.*;
import java.io.*;

public class Main {

    public Main(String Eng, String For) {
        this.Eng = Eng;
        this.For = For;
    }
    String Eng;
    String For;

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList();
        Map<Integer, Main> dic = new Hashtable<Integer, Main>();
        int i = 0;

        while (true) {
            String d = in.nextLine();

            if (d.isEmpty()) {
               // System.out.println("----------");
                break;

            } else {
                String a[] = d.split("\\s+");
                dic.put(i, new Main(a[0], a[1]));
                i++;
            }

        }
        
        while (true) {
            i=0;
            String next = in.next();
            
            for (Map.Entry<Integer, Main> entry : dic.entrySet()) {
                Integer key = entry.getKey();
                Main value = entry.getValue();
                if (next == null ? value.For == null : next.equals(value.For)) {
                    System.out.println(value.Eng);
                    break;
                }else{
                    i++;
                }
                if (i==dic.size()) {
                    System.out.println("eh");
                }
                     
            }
           
        }
        

    }

}
*/