
import java.util.Scanner;

public class ArrMaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");

        int [] numbers = new int[arr.length];

        int maxIndex =0;
        int countMax =0;


        for (int i = 0; i < arr.length ; i++) {
            numbers[i]= Integer.parseInt(arr[i]);

        }

        for (int i = 0; i < numbers.length-1 ; i++) {
           int  currentCount=0;

            for (int j = i; j < numbers.length ; j++) {

                if (numbers[i] == numbers[j]){
                    currentCount++;

                    if (currentCount > countMax){
                        countMax = currentCount;
                        maxIndex = i;
                    }
                }else {
                    break;
                }

            }

        }

        for (int i = 0; i < countMax ; i++) {
            System.out.print(numbers[i + maxIndex] + " " );

        }


    }
}
