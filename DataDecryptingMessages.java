import java.util.Scanner;

public class DataDecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key =Integer.parseInt(scanner.nextLine());
        int n =Integer.parseInt(scanner.nextLine());
        String message ="";

        for (int i = 1; i <=n ; i++) {
            message+= (char)(scanner.next().charAt(0)+ key);

        }
        System.out.println(message);
    }
}
