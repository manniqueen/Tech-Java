

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataTypeFinderTryCatch {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String input = "";

        while (!input.equalsIgnoreCase("END")){
            input = scanner.nextLine();

            if (input.equals("END")){
                break;
            }
            boolean isInt = true;

            try {
                int integer = Integer.parseInt(input);
            } catch (NumberFormatException e){
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double doubl = Double.parseDouble(input);
            } catch (NumberFormatException e){
                isDouble = false;
            }

            if (isInt){
                System.out.printf("%s is integer type%n",input);
            } else if (isDouble){
                System.out.printf("%s is floating point type%n",input);
            } else if (input.length() == 1){
                System.out.printf("%s is character type%n",input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))){
                System.out.printf("%s is boolean type%n",input);
            } else {
                System.out.printf("%s is string type%n",input);
            }
        }

    }
}

