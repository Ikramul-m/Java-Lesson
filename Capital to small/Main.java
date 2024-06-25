import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("\nOriginal: " + str);
        // toggle
        // PhYsICs -> pHySicS

        for (int i = 0; i < str.length(); i++) {
            // check -> alphabet- small or capital
            boolean flag = true; // true -> cpital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97) // false -> small
                flag = false;

            if (flag == true) {
                ascii += 32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            } else {
                ascii -= 32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            }

        }

        System.out.println();

        System.out.println("Output: " + str);

    }
}
