import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 6 };

        int copyOfNumbers[] = Arrays.copyOf(number, number.length);

        System.out.print(Arrays.equals(number, copyOfNumbers));

    }
}
