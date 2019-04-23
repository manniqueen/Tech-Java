import java.util.Scanner;

public class BooleanInstanceOfOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        String name = "James";

//        ( Object reference variable ) instanceof  (class/interface type)


        // following will return true since name is type of String
        boolean result = name instanceof String ;
        System.out.println( result );
    }
}
