import java.util.Arrays;
import java.util.Scanner;

public class ArrTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] wagon = new int[n];
        int sum = 0;


        for (int i = 0; i < wagon.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagon[i]= people;
            sum+=people;

        }

            System.out.println(Arrays.toString(wagon).replace("[","")
                    .replace(",","").replace("]",""));

        System.out.println(sum);

    }
}
