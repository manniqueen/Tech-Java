import java.util.Scanner;

public class TextReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equalsIgnoreCase("end")){

            String reversed = "";

            for (int i = line.length()-1; i >= 0  ; i--) {

                reversed += line.charAt(i);

            }
            System.out.printf("%s = %s%n",line,reversed);


            line = scanner.nextLine();
        }




    }
}
