package basicJava;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("enter letter :");
        ch=input.next().charAt(0);
        if (ch=='a' || ch== 'A'){
            System.out.println("Vowel");
        }
        else if (ch=='e'|| ch== 'E'){
            System.out.println("Vowel");
        }
        else if (ch=='i'|| ch== 'I'){
            System.out.println("Vowel");
        }else if (ch=='0'|| ch== '0'){
            System.out.println("Vowel");
        }else if (ch=='u'|| ch== 'U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
