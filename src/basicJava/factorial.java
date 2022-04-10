package basicJava;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fact=1;


        System.out.println("Enter any positive number:");
        n=input.nextInt();



        for(int i = n; i >= 1; i--)
        {

            System.out.print(i+" * ");
            fact = fact * i;

        }
        System.out.println();
        System.out.println("factorial of " +n +" = " + fact);
    }
}
