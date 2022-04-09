package basicJava;

import java.util.Scanner;

public class Series_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fact = 1;


        System.out.println("Enter N number:");
        n=input.nextInt();



        for(int i = 1; i <= n; i=i+2)
        {

            System.out.print(i+" * ");
            fact = fact * i;

        }
        System.out.println();
        System.out.println("Sum = " + fact);
    }
}
