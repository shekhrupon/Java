package basicJava;

import java.util.Scanner;

public class Triangle_circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base, height, area, redius,area_c;

        System.out.println("Base :");
        base= input.nextDouble();

        System.out.println("Height :");
        height= input.nextDouble();

        System.out.println("Redius :");
        redius= input.nextDouble();

        area= 0.5*base*height;
        area_c=  3.1416 *redius*redius;


        System.out.println("Area of Triangle :" +area);

        System.out.println("Cirlc of Triangle :" +area_c);
    }
}
