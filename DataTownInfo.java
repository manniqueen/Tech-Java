import java.util.Scanner;

public class DataTownInfo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String city =scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area =Integer.parseInt(scanner.nextLine());



        System.out.println(String.format("Town %s has population of %d and area %d square km.",
                city,population,area));
    }
}
