import java.util.Scanner;

public class MAddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(finalSum(a,b,c));

    }

    public static int finalSum (int a, int b, int c){
        int add = a + b;
        return add - c;

    }
}
