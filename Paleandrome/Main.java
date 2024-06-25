import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder gtr = new StringBuilder(str);

        gtr.reverse();
        String s = gtr + "";

        if (str.equals(s))
            System.out.println("Peleandrome");
        else
            System.out.println("Not Peleandrome");

    }
}
