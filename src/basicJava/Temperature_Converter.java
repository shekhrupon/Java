package basicJava;

import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        double faharenheit, celsius;
        Scanner input= new Scanner(System.in);

        System.out.println("Faharenheit :");
        faharenheit= input.nextDouble();

        celsius = (faharenheit-32) * 0.55555556;

        System.out.println("Celsius :" +celsius);
    }
}
