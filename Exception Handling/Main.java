import java.util.Scanner;
import java.util.InputMismatchException;

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
    catch(InputMismatchException e){
      System.out.println("Please enter a number.");
    }

  }
}