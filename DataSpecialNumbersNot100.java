import java.util.Scanner;

public class DataSpecialNumbersNot100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int digit =0;


        for (int i = 1; i <= n; i++)
        {
            int sum = 0;


            digit = i % 10;
            sum += digit;
            digit = i / 10;
            if (digit != 0)
            {
                digit = digit % 10;
                sum += digit;
                digit = digit / 10;
            }
            if (digit != 0)
            {
                digit = digit % 10;
                sum += digit;
                digit = digit / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11)
            {
                System.out.printf("%d -> True%n",i);
            }
            else
            {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
