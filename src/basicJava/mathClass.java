package basicJava;

public class mathClass {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        int max = Math.max(x,y);
        System.out.println("max : "+max);

        int min = Math.min(x,y);
        System.out.println("min : "+min);

        int abs = Math.abs(x);
        System.out.println("Absulate value of x : "+abs);

        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 : "+round);

        double pi = Math.PI;
        System.out.println("PI : "+pi);



    }
}
