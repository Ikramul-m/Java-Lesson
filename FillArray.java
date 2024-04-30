import java.util.Arrays;

class FillArray {
    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 6 };

        int copyofNumbers[] = Arrays.copyOf(number, number.length);

        Arrays.fill(number, 3);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyofNumbers));
    }
}
