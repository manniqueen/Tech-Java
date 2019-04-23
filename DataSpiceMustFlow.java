import java.util.Scanner;

public class DataSpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spice = Integer.parseInt(scanner.nextLine());
        int additional =0;
        int countDays =0;

        while(spice >=100){
           additional+= spice-=26;
           spice +=16;
           countDays ++;

           if (spice < 100){
               additional -=26;

               break;

           }


        }

        System.out.println(countDays);
        System.out.println(additional);


    }
}
