import java.util.Scanner;

public class ArrSumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            int number = Integer.parseInt(numbers[i]);

            if (number % 2 == 0){
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
