import java.util.Scanner;
class A_Bitplus
{
	public static void main(String[] args) 
	{
		 int numCount, value = 0;
        String operate;
        Scanner in = new Scanner(System.in);
        numCount = in.nextInt();

        for (int i = 0; i < numCount; i++) {
            operate = in.next();

            if (operate.equalsIgnoreCase("X++")) {
                ++value;
                
            } else if (operate.equalsIgnoreCase("++X")) {
                value++;
               
            } else if (operate.equalsIgnoreCase("X--")) {
                --value;
            } else if (operate.equalsIgnoreCase("--X")) {
                value--;
            }
        }
       System.out.print(value);
		
	}
}
