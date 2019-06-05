import java.util.Scanner;

public class MCharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = (int) scanner.next().charAt(0);
        int b = (int) scanner.next().charAt(0);


        result(a, b);

    }

    public static void result(int a, int b) {
        if (a < b) {
            for (int i = ++a; i < b; i++) {
                System.out.print((char) i + " ");

            }

        }else {
            for (int i = ++b; i < a; i++) {
                System.out.print((char) i + " ");

            }
        }

    }
}
