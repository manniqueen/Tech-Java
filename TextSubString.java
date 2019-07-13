import java.util.Scanner;

public class TextSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int index = second.indexOf(first);


        while(index != -1){

            second = second.substring(0,index) +
                    second.substring(index + first.length());

            index = second.indexOf(first);
        }


        System.out.println(second);


    }

}
