package basicJava;

public class break_continue_statement1 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i=i+1){
            if (i==10) {
                continue;
            }
            if (i>13){
                break;
            }
            System.out.println(i);

        }

    }
}
