import java.util.Scanner;

public class MGreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("int")){
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int getMax = getMax(first,second);
            System.out.print(getMax);


        }else if (type.equalsIgnoreCase("char")){
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            char maxChar = getMax(first,second);
            System.out.print(maxChar);


        }else if (type.equalsIgnoreCase("String")){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String maxString = getMax(first,second);
            System.out.print(maxString);


        }



    }

    public  static int getMax (int first, int second){

        if ( first > second){
            return first;

        }

        return second;

    }

    public static char getMax (char first, char second){
        if (first > second){
            return  first;
        }

        return second;
    }

    public  static  String getMax (String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }

        return second;
    }
}
