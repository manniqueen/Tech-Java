import java.util.Scanner;

public class DataLowerOrUpperCharCheck {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        char a =scanner.next().charAt(0);

        boolean isUpperCase = Character.isUpperCase(a);
        boolean isLowerCase =Character.isLowerCase(a);

        if (isUpperCase){
            System.out.println("upper-case");
        }else if(isLowerCase){
            System.out.println("lower-case");

        }
    }
}
/*
System.out.println(Character.isUpperCase('c'));
  System.out.println(Character.isUpperCase('C'));

  false
true
 */
