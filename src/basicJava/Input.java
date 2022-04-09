package basicJava;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String name;
        int num;
        float cgpa;

        System.out.println("Enter Name ");
        name= input.nextLine();

        System.out.println("Enter Age ");
        num= input1.nextInt();

        System.out.println("Enter Cgpa ");
        cgpa= input2.nextFloat();

        System.out.println("Name : "+name);
        System.out.println("Age : "+num);
        System.out.println("CGPA : "+cgpa);

    }
}
