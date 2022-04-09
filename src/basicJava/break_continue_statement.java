package basicJava;

public class break_continue_statement {
    public static void main(String[] args) {
        for (int i=1; i<=100; i=i+2){
            if (i==11) {
                break;
            }
            System.out.println(i);
        }

    }
}
