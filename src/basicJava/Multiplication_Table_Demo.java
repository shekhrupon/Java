package basicJava;

import java.util.Scanner;

public class Multiplication_Table_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum;

        System.out.println("Enter number of Multiplication");
        num = input.nextInt();

        for (int i=1; i<=10; i++){

            sum=num*i;
            System.out.println(num+" x "+i +" = " +sum);
        }
    }
}
