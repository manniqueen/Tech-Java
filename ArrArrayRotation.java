import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rotation = Integer.parseInt(scanner.nextLine());

        int temp =0;

        for (int i = 0; i < rotation ; i++) {
            temp =  numbers[0];

            for (int j = 0; j < numbers.length-1; j++) {
                numbers[j]=numbers[j +1];

            }

            numbers[numbers.length-1]= temp;
            
        }

        System.out.println(Arrays.toString(numbers).replace("[","")
        .replace(",","").replace("]",""));





    }
}
