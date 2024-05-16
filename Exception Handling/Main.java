import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero. Idiot!");
        }

    }
}