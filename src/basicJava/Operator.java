package basicJava;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("First Number :");
        num1=input.nextInt();

        System.out.println("Second Number :");
        num2=input.nextInt();


        sum = num1+num2;
        System.out.println("Sum = "+sum);

        sum = num1-num2;
        System.out.println("Sub = "+sum);

        sum = num1*num2;
        System.out.println("Mul = "+sum);

        sum = num1/num2;
        System.out.println("Div = "+sum);

        double sum2 = (double) num1/num2;
        System.out.println("Div = "+sum2);

        sum = num1%num2;
        System.out.println("Mod = "+sum);

    }
}
