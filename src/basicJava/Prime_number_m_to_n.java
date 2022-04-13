package basicJava;

import java.util.Scanner;

public class Prime_number_m_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int totalPrime = 0;
        System.out.println("Enter initial number:");
        int m = input.nextInt();
        System.out.println("Enter final number:");
        int n = input.nextInt();

        for(int i = m; i < n; ++i) {
            for(int j = 2; j <= i - 1; ++j) {
                if (i % j == 0) {
                    ++count;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
                ++totalPrime;
            }

            count = 0;
        }

        System.out.println("total prime number = " + totalPrime);
    }
}
