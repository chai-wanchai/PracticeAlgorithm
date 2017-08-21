/*
E - Drinks 
Little Vasya loves orange juice very much. That's why any food and drink in his kitchen necessarily contains orange juice. 
There are n drinks in his fridge, the volume fraction of orange juice in the i-th drink equals pi percent.

One day Vasya decided to make himself an orange cocktail. He took equal proportions of each of the n drinks and mixed them. 
Then he wondered, how much orange juice the cocktail has.

Find the volume fraction of orange juice in the final drink.

Input
The first input line contains a single integer n (1???n???100) � the number of orange-containing drinks in Vasya's fridge. 
The second line contains n integers pi (0???pi???100) � the volume fraction of orange juice in the i-th drink, in percent. 
The numbers are separated by a space.

Output
Print the volume fraction in percent of orange juice in Vasya's cocktail. 
The answer will be considered correct if the absolute or relative error does not exceed 10??-?4.

Example
Input
3
50 50 100
Output
66.666666666667
Input
4
0 25 50 75
Output
37.500000000000
Note
Note to the first sample: let's assume that Vasya takes x milliliters of each drink from the fridge. 
Then the volume of pure juice in the cocktail will equal  milliliters. The total cocktail's volume equals 3?x milliliters, 
so the volume fraction of the juice in the cocktail equals , that is, 66.(6) percent.
*/
import java.util.Scanner;

public class E_Drinks  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p[] = new int[n];
        double sum =0;
        for (int i = 0; i < n; i++) {
            p[i]=in.nextInt();
            sum+=p[i];
        }
        System.out.println(sum/n);
       
    }
}
