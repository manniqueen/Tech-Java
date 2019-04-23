import java.util.Scanner;

public class ArrReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] letters = scanner.nextLine().split(" ");

        String reverse = "";

        for (int i = 0; i < letters.length /2 ; i++) {
            reverse = letters [i];
            letters [i] = letters [letters.length - 1 - i];
           letters[letters.length -1 -i] = reverse;

        }

        System.out.println(String.join(" ",letters));
    }
}
