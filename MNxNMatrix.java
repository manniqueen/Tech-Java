import java.util.Scanner;

public class MNxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num ; i++) {
            System.out.println(newString(String.valueOf(num),num));

        }
    }

    private  static String newString (String symbol, int count){
        String result ="";

        for (int i = 0; i < count ; i++) {
            result += symbol + " ";

        }

        return  result.trim();

    }
}
