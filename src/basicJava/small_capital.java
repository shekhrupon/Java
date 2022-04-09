package basicJava;

import java.util.Scanner;

public class small_capital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("enter letter :");
        ch=input.next().charAt(0);
        if (ch>='a' && ch<='z')
        {
            System.out.println("small");
        }
        else if (ch>='A' && ch<='Z')
        {
            System.out.println("capitall");
        }
        else {
            System.out.println("Not a letter");
        }
    }
}
