import java.util.Scanner;

public class ArrEvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] num = scanner.nextLine().split(" ");

        int sumOdd =0;
        int sumEven =0;

        for (int i = 0; i < num.length ; i++) {
           int numbers = Integer.parseInt(num[i]);

           if ( numbers % 2 == 0){
               sumEven +=numbers;
           }else {
               sumOdd += numbers;
           }

        }

        int finalSum = sumEven - sumOdd;
        System.out.println(finalSum);
    }
}
