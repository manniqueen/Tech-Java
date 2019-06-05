import java.util.Scanner;

public class MTopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            if (hasOneOdd(i) && isDivisibleBy8(i)) {
                System.out.println(i);
            }

        }
    }

    private static boolean hasOneOdd(int number) {

        String num = String.valueOf(number);


        for (int i = 0; i < num.length(); i++) {

            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 == 1) {
                return true;
            }

        }

        return false;
    }

    private static boolean isDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum % 8 == 0;

    }
}
