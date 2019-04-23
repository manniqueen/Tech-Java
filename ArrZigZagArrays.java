import java.util.Arrays;
import java.util.Scanner;

public class ArrZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArr = new String[n];

        String [] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String [] two2 = (scanner.nextLine().split(" "));

            if (i % 2 ==0){
                firstArr[i]= two2[0];
                secondArr[i] = two2[1];
            }else {
                firstArr[i]= two2[1];
                secondArr[i]= two2[0];
            }



        }

        /*

        String f1 = "";
        String f2= "";
        f1+= firstArr[i]+ " ";
        System.out.print (f1)
         */
        System.out.println(Arrays.toString(firstArr).replace("[","")
                .replace(",","").replace("]",""));

        System.out.println(Arrays.toString(secondArr).replace("[","")
        .replace(",","").replace("]",""));



    }
}
