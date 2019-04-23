import java.util.Scanner;

public class DataBalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        String firstBracket ="";
        String secondBracket ="";
        boolean firstBalanced = false;
        boolean secondBalanced =false;



        for (int i = 1; i <=n ; i++) {
            String character = scanner.nextLine();

            if (character.equalsIgnoreCase("(")){
                if (secondBalanced){
                    firstBracket = "(";
                    firstBalanced =true;
                }

                if (character.equalsIgnoreCase(")")){
                    if (firstBalanced)
                    secondBracket = ")";
                    secondBalanced=true;

                }


            }

        }
        if(firstBalanced && secondBalanced){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }

    }
}
