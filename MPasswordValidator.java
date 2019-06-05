import java.util.Scanner;

public class MPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        if (!isLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");

        }
        if (!isLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");

        }
        if (!isMoreThan2Digits(password)) {
            System.out.println("Password must have at least 2 digits");

        }
        if (isLength(password) && isLettersAndDigits(password) && isMoreThan2Digits(password)) {

            System.out.println("Password is valid");
        }

    }

    public static boolean isLength(String password) {
        return password.length() >= 6 && password.length() <= 10;

    }

    public static boolean isLettersAndDigits(String password) {

        boolean isTrue = false;


        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);

            if ((symbol >= 'a' && symbol <= 'z') ||
                    (symbol >= 'A' && symbol <= 'Z') ||
                    (symbol >= '0' && symbol <= '9')) {

                //Character.isLetter   Character.isDigit

                isTrue = true;


            }else {
                isTrue = false;
                break;
            }


        }

        return isTrue;
    }

    public static boolean isMoreThan2Digits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);

            //if (Character.isDigit(password.charAt(i)))

            if (Character.isDigit(symbol)) {
                counter++;

                if (counter >= 2) {
                    return true;
                }
            }

        }

        return false;
    }


}
