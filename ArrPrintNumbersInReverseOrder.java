import java.util.Arrays;
import java.util.Scanner;

public class ArrPrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int [] normalNumbers = new  int[count];

        for (int i = 0; i < count ; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            normalNumbers [i] += numbers;

        }

        for (int i = normalNumbers.length -1; i >= 0; i--) {

            System.out.println(normalNumbers[i]);

        }

    }

}

