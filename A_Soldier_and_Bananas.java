/*
A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 
2k dollars for the second one and so on (in other words, he has to pay i?k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

Input
The first line contains three positive integers k,?n,?w (1??<=??k,?w??<=??1000, 0?<=?n?<=?109), the cost of the first banana, 
initial number of dollars the soldier has and number of bananas he wants.

Output
Output one integer � the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

Examples
input
3 17 4
output
13

*/
import java.util.*;
import java.io.*;

public class A_Soldier_and_Bananas {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int amount = 0;
        for (int j = 1; j <= w; j++) {
            amount += k * j;
           
        }
        System.out.println(Math.max(0, amount-n));
        //System.out.println(Math.max(0, w * (w + 1) / 2 * k - n));

    }

}
