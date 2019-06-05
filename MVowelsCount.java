import java.util.Scanner;

public class MVowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] word =scanner.nextLine().split("");

        System.out.println(vowels(word));
    }

    public static int vowels (String [] word){
        int countVowel = 0;

        for (char i = 0; i < word.length ; i++) {

            if (word[i] .equalsIgnoreCase("a") || word[i] .equalsIgnoreCase("e")
                    || word[i] .equalsIgnoreCase("i") ||
                    word[i] .equalsIgnoreCase("o") || word[i] .equalsIgnoreCase("u")
                    || word[i] .equalsIgnoreCase("A") || word[i] .equalsIgnoreCase("E")
            || word[i] .equalsIgnoreCase("I") || word[i] .equalsIgnoreCase("O") ||
                    word[i] .equalsIgnoreCase("U")) {

                countVowel++;

            }

        }

        return countVowel;
    }
}
