package basicJava;

import java.util.Scanner;

public class Vowel_Consonant_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("enter letter :");
        ch=input.next().charAt(0);
        if (ch=='a' || ch== 'A' || ch=='e'|| ch== 'E' || ch=='i'|| ch== 'I' || ch=='0'|| ch== '0' ||ch=='u'|| ch== 'U'){
            System.out.println("Vowel");
        }

        else {
            System.out.println("Consonant");
        }
    }
}
