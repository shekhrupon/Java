package basicJava;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter num :");
        num=input.nextInt();
        if (num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }
}
