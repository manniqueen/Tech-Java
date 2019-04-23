
import java.util.Arrays;
        import java.util.Scanner;

public class ArrDayOfTheWeek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String [] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        if (number == 1){
            System.out.println(days [0]);
        }else if (number == 2){
            System.out.println(days [1]);
        }else if (number == 3){
            System.out.println(days [2]);
        }else if (number == 4){
            System.out.println(days [3]);
        }else if (number == 5){
            System.out.println(days [4]);
        }else if (number == 6){
            System.out.println(days [5]);
        }else if (number == 7){
            System.out.println(days [6]);
        }else {
            System.out.println("Invalid day!");
        }

    }

}

