
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExamRegArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "^([A-Za-z0-9!@#$?]+)=(\\d+)<<(\\w+)$";
        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("Last note")){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String text = matcher.group(1);
                int length = Integer.parseInt(matcher.group(2));
                String code = matcher.group(3);
                String resultName = "";
                if (code.length() != length){
                    System.out.println("Nothing found!");
                } else {
                    for (int i = 0; i < text.length() ; i++) {
                        char c = text.charAt(i);
                        if (Character.isLetterOrDigit(c)) {
                            resultName += c;
                        }
                    }
                    System.out.printf("Coordinates found! %s -> %s%n", resultName, code);
                }

            } else {
                System.out.println("Nothing found!");
            }
            input = scanner.nextLine();
        }

    }
}