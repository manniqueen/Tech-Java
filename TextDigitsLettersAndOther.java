import java.util.Scanner;

public class TextDigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  chars = scanner.nextLine();
        String letters ="";
        String numbers = "";
        String others = "";

        for (int i = 0; i < chars.length(); i++) {
            if (Character.isDigit(chars.charAt(i))){

                numbers += chars.charAt(i);
            }else if (Character.isAlphabetic(chars.charAt(i))){
                letters += chars.charAt(i);
            }else {
                others += chars.charAt(i);
            }


        }

        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(others);

    }
}
