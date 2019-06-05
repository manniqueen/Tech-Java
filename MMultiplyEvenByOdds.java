
import java.util.Scanner;

public class MMultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numbers = Integer.parseInt(scanner.nextLine());

        int odd =0;
        int even =0;

        while (numbers != 0){
            int digit = numbers % 10;


            if (digit % 2 ==0){
                even += digit;

            }else {
                odd+= digit;
            }

           numbers /= 10;

            if (numbers == 0){
                break;
            }
        }

        System.out.println(sum(even, odd));


    }

    public static int sum (int even, int odd){
        int result = even * odd;
        return result;

    }
}
