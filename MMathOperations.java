import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class MMathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int b =Integer.parseInt(scanner.nextLine());

        System.out.println(sum(a, symbol, b));

    }

    public static int sum (int a, String symbol, int b){
        int sum =0;

        if (symbol.equalsIgnoreCase("*")){
            sum+= a * b;

        }else if (symbol.equalsIgnoreCase("/")){
            sum += a / b;

        }else if (symbol.equalsIgnoreCase("-")){
            sum += a - b;

        }else if (symbol.equalsIgnoreCase("+")){
            sum += a + b;
        }
        return sum;
    }
}
