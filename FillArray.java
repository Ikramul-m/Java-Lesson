import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 6 };

        int start = 2;
        int end = 5;

        int copyofNumbers[] = Arrays.copyOf(number, number.length);
        int copyOfRnge[] = Arrays.copyOfRange(number, start, end);

        Arrays.fill(number, 0);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyofNumbers));
        System.out.println(Arrays.toString(copyOfRnge));
    }
}
