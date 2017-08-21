import java.util.Scanner;
class A_Theatre_Square 
{
	public static void main(String[] args) 
	{
		
        long n, m, a, count = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        a = in.nextInt();

        if (m % a == 0) {
            m = m / a;
        } else {
            m = m / a + 1;
        }
        if (n % a == 0) {
            n = n / a;
        } else {
            n = n / a + 1;
        }
        count = m * n;
        System.out.println(count);
	}
}
