import java.util.Scanner;

public class MMiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        middleChar(word);



    }

    public static void middleChar (String word){

        char symbol = word.charAt(word.length() / 2);

        if (word.length() % 2 ==0){
            System.out.print(word.charAt(word.length() / 2 -1));
        }

        System.out.print(symbol);
    }
}
