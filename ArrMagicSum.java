import java.util.Scanner;

public class ArrMagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            numbers[i] = Integer.parseInt(arr[i]);

        }

        for (int i = 0; i < numbers.length-1; i++) {


            for (int j = i + 1; j < numbers.length; j++) {


                if (numbers[i] + numbers[j] == n) {

                    System.out.print(numbers[i] + " ");
                    System.out.print(numbers[j] + " ");
                    System.out.println();

                }

            }

        }
    }
}
