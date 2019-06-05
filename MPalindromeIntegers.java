import java.util.Scanner;

public class MPalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equalsIgnoreCase("END")) {


            for (int i = 0; i < input.length(); i++) {


                if (input.charAt(0) == input.charAt(input.length()  - 1)) {
                    System.out.println("true");

                } else {
                    System.out.println("false");
                }
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("END")){
                    break;
                }

            }

        }
    }


}
