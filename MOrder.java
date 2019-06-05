import java.util.Scanner;

public class MOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (product.equalsIgnoreCase("coffee")) {
            price += count * 1.50;

        } else if (product.equalsIgnoreCase("water")) {
            price += count * 1.00;

        } else if (product.equalsIgnoreCase("coke")) {
            price += count * 1.40;

        } else if (product.equalsIgnoreCase("snacks")) {
            price += count * 2.00;
        }

        finalPrice(product,count,price);
    }

    public static void finalPrice(String product, int count, double price) {
        System.out.printf("%.2f", price);
    }
}
