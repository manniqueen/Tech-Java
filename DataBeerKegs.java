import java.util.Scanner;

public class DataBeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume =0;
        String biggest = "";

        for (int i = 1; i <= n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                biggest = model;

            }


        }
        System.out.printf("%s",biggest);

    }
}
