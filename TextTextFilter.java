import java.util.Scanner;

public class TextTextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {

            if (text.contains(bannedWord)){
                String replacement = repeatStr ("*", bannedWord.length());
                text = text.replace(bannedWord, replacement);
            }
        }
        System.out.println(text);




    }

    private static String repeatStr(String s, int length) {
        String replacement = "";
        for (int i = 0; i <length ; i++) {
            replacement += s;

        }
        return replacement;
    }


}
