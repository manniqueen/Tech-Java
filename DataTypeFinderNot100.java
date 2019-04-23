import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import static java.lang.Integer.*;

public class DataTypeFinderNot100 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input = "";
        int number =0;


        while (!input.equalsIgnoreCase("END")){
            input = scanner.nextLine();


            if (input.equalsIgnoreCase("END")){
                break;
            }

            if (input.charAt(0)==0.0){
                System.out.printf("%s is integer type",input);


            }else if (input.equalsIgnoreCase("true")|| input.equalsIgnoreCase("false")){
                System.out.printf("%s is boolean type",input);

            }else if (input.length()== 1){
                System.out.printf("%s is character type",input);

            }else {
                System.out.printf("%s is string type",input);
            }




        }
    }
}
