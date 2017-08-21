/*

 */

import java.util.*;
import java.io.*;

public class F_A_Typical_Homework {

    String SID;
    int CID;
    String Name;
    int chinese;
    int math;
    int eng;
    int program;

    public F_A_Typical_Homework(String SID, int CID, String Name, int chinese, int math, int eng, int program) {
        this.SID = SID;
        this.CID = CID;
        this.Name = Name;
        this.chinese = chinese;
        this.math = math;
        this.eng = eng;
        this.program = program;
        this.math = math;
       

    }

    public static Map<Integer, F_A_Typical_Homework> map = new Hashtable<Integer, F_A_Typical_Homework>();
    public static Scanner in = new Scanner(new InputStreamReader(System.in));
    public static int countItem = 1;

    public static void main(String[] args) {

      
        do {
			System.out.println();
            System.out.println("Welcome to Student Performance Management System (SPMS).");
            System.out.println("1 - Add\n"
                    + "2 - Remove\n"
                    + "3 - Query\n"
                    + "4 - Show ranking\n"
                    + "5 - Show Statistics\n"
                    + "0 - Exit");
            int menu = in.nextInt();
            switch (menu) {
                case 1:
                    AddingAStudent();

                    break;
                case 2:
                    RemovingAStudent();
                    break;
                case 3:
                    Query();
                    break;
                case 4:
                    System.out.println("Showing the ranklist hurts students’ self-esteem. Don’t do that.");
                    
                    break;
                case 5:
                    ShowingStatistics();

                    break;
                case 0:
                    return;

                default:
                    return;
               
            }
			System.out.println();

        } while (true);

    }

    public static void AddingAStudent() {
       
        boolean duplicate = false;
        int cId;
        String name = "";
        int chinese = 0;
        int math = 0;
        int eng = 0;
        int program = 0;
        int score[] = new int[4];
       
        while (true) {
            System.out.println("Please enter the SID, CID, name and four scores. Enter 0 to finish.");
            String id = in.next();
            if (id.length() - 1 == 0 && id.charAt(0) == '0') {
                return;
            }
            cId = in.nextInt();
            name = in.next();
            chinese = in.nextInt();
            math = in.nextInt();
            eng = in.nextInt();
            program = in.nextInt();

            for (Map.Entry<Integer, F_A_Typical_Homework> entry : map.entrySet()) {
                Integer key = entry.getKey();
                F_A_Typical_Homework value = entry.getValue();

                if (value.SID.equals(id)) {
                    System.out.println("Duplicated SID.");
                    duplicate = true;
                    countItem = countItem - 1;
                   
                }
            }
            if (!duplicate && !"".equals(id)) {

                map.put(countItem, new F_A_Typical_Homework(id, cId, name, chinese, math, eng, program));
            }
            countItem++;
            duplicate = false;

        }

    }

    public static void RemovingAStudent() {
        while (true) {

            System.out.println("Please enter SID or name. Enter 0 to finish.");
            String del = in.next();
            if (del.length() == 1 && del.charAt(0) == '0') {
                return;
            }
            short count = 0;
            ArrayList lust = new ArrayList();
            for (Map.Entry<Integer, F_A_Typical_Homework> entry : map.entrySet()) {
                Integer key = entry.getKey();
                F_A_Typical_Homework value = entry.getValue();
                if (value.SID.equals(del) || value.Name.equals(del)) {
                    lust.add(key);
                    count++;
                }

            }
            for (int i = 0; i < count; i++) {
                map.remove(lust.get(i));
            }
            System.out.println(count + " student(s) removed.");
        }
    }

    public static void Query() {
        while (true) {

            System.out.println("Please enter SID or name. Enter 0 to finish.");
            String id = in.next();
            if (id.length() == 1 && id.charAt(0) == '0') {
                return;
            }

            float countScore;
            float avg;

            for (Map.Entry<Integer, F_A_Typical_Homework> entry : map.entrySet()) {
                int key = entry.getKey();
                F_A_Typical_Homework b = entry.getValue();
                if (b.SID.equals(id) || b.Name.equals(id)) {
                    countScore = b.chinese + b.eng + b.math + b.program;
                    avg = countScore / 4;
                    
                    System.out.println(key + " " + b.SID + " " + b.CID + " " + b.Name + " "
                            + b.chinese + " " + b.eng + " " + b.math + " " + b.program + " " + countScore + " " + avg);
                   
                }

            }
        }
    }

    public static void ShowingStatistics() {
       
        System.out.println("Please enter class ID, 0 for the whole statistics.");
        int cid = in.nextInt();

        double sum[] = new double[4];
        
        int count = 0;
        int pass[][] = new int[4][2];
        int overall[] = new int[6];
        int scorePass = 0;
        for (Map.Entry<Integer, F_A_Typical_Homework> entry : map.entrySet()) {
            Integer key = entry.getKey();
            F_A_Typical_Homework value = entry.getValue();
            if (value.CID == cid) {
                sum[0] += value.chinese;
                sum[1] += value.math;
                sum[2] += value.eng;
                sum[3] += value.program;
                count++;
                if (60 <= value.chinese) {
                    pass[0][0]++;
                    scorePass++;
                } else {
                    pass[0][1]++;
                }
                if (60 <= value.math) {
                    pass[1][0]++;
                    scorePass++;
                } else {
                    pass[1][1]++;
                }
                if (60 <= value.eng) {
                    pass[2][0]++;
                    scorePass++;
                } else {
                    pass[2][1]++;

                }
                if (60 <= value.program) {
                    pass[3][0]++;
                    scorePass++;
                } else {
                    pass[3][1]++;
                }

                if (scorePass == 4) {
                    overall[0]++;
                }
                if (scorePass >= 3) {
                    overall[1]++;
                }
                if (scorePass >= 2) {
                    overall[2]++;
                }
                if (scorePass >= 1) {
                    overall[3]++;
                }
                if (scorePass == 0) {
                    overall[4]++;
                }

                scorePass = 0;

            } else if (cid == 0) {
                sum[0] += value.chinese;
                sum[1] += value.math;
                sum[2] += value.eng;
                sum[3] += value.program;
                count++;
                if (60 <= value.chinese) {
                    pass[0][0]++;
                    scorePass++;

                } else {
                    pass[0][1]++;
                }
                if (60 <= value.math) {
                    pass[1][0]++;
                    scorePass++;
                } else {
                    pass[1][1]++;
                }
                if (60 <= value.eng) {
                    pass[2][0]++;
                    scorePass++;
                    
                } else {
                    pass[2][1]++;
                   
                }
                if (60 <= value.program) {
                    pass[3][0]++;
                    scorePass++;
                } else {
                    pass[3][1]++;
                }
                
                if (scorePass == 4) {
                    overall[0]++;
                }
                if (scorePass >= 3) {
                    overall[1]++;
                }
                if (scorePass >= 2) {
                    overall[2]++;
                }
                if (scorePass >= 1) {
                    overall[3]++;
                }
                if (scorePass == 0) {
                    overall[4]++;
                }

                scorePass = 0;

            }

        }

        System.out.println("Chinese\n"
                + "Average Score: " + (sum[0] / count) + "\n"
                + "Number of passed students: " + pass[0][0] + "\n"
                + "Number of failed students: " + pass[0][1]);
        System.out.println("Mathematics\n"
                + "Average Score: " + (sum[1] / count) + "\n"
                + "Number of passed students: " + pass[1][0] + "\n"
                + "Number of failed students: " + pass[1][1]);
        System.out.println("English\n"
                + "Average Score: " + (sum[2] / count) + "\n"
                + "Number of passed students: " + pass[2][0] + "\n"
                + "Number of failed students: " + pass[2][1]);
        System.out.println("Programming\n"
                + "Average Score: " + (sum[3] / count) + "\n"
                + "Number of passed students: " + pass[3][0] + "\n"
                + "Number of failed students: " + pass[3][1]);
        System.out.println("Overall:");

        System.out.println("Number of students who passed all subjects: " + overall[0] + "\n"
                + "Number of students who passed 3 or more subjects: " + overall[1] + "\n"
                + "Number of students who passed 2 or more subjects: " + overall[2] + "\n"
                + "Number of students who passed 1 or more subjects: " + overall[3] + "\n"
                + "Number of students who failed all subjects: " + overall[4]);
     

    }

  
}
