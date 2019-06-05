import java.util.Arrays;
import java.util.Scanner;

public class NoSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < arr.length ; i++) {
            if (i < arr.length){
                System.out.println(arr [i]+ " ");
            }else {
                System.out.println(arr [i]);

                // Syste.out.print(arr.trim) maha poslededno prazno mqsto
            }

        }

    }
}
