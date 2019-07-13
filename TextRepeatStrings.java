import java.util.Scanner;

public class TextRepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" +");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            String el = words[i];
            int length = el.length();

            for (int j = 0; j <length ; j++) {
                result += el;

            }

        }

        System.out.println(result);
    }
}
