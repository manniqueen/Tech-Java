import java.util.Scanner;

public class BasicVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if ("Friday".equalsIgnoreCase(day)){
            switch (typeOfGroup){
                case "Students":
                    price = 8.45;
                    break;
                case "Business":
                    price = 10.90;
                    break;
                case "Regular":
                    price = 15;
                    break;
                    default:
                        break;
            }

        }else if ("Saturday".equalsIgnoreCase(day)){
            switch (typeOfGroup){
                case "Students":
                    price = 9.80;
                    break;
                case "Business":
                    price = 15.60;
                    break;
                case "Regular":
                    price = 20;
                    break;
                    default:
                        break;
            }
        }else if ("Sunday".equalsIgnoreCase(day)){
            switch (typeOfGroup){
                case "Students":
                    price = 10.46;
                    break;
                case "Business":
                  price = 16;
                  break;
                case "Regular":
                    price = 22.50;
                    break;
                    default:
                        break;
            }
        }

        double finalPrice = people * price;

        if (typeOfGroup .equalsIgnoreCase("Students") && people >= 30){
            finalPrice = finalPrice - (finalPrice * 15/100);

        }else if (typeOfGroup .equalsIgnoreCase("Business") && people >= 100){
            finalPrice = (people - 10) * price;

        }else if (typeOfGroup .equalsIgnoreCase("Regular") && people >= 10 && people <= 20 ){
            finalPrice = finalPrice - (finalPrice * 5/100);
        }

        System.out.printf("Total price: %.2f", finalPrice);
    }
}
