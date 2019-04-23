import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String []firstArr = scanner.nextLine().split(" ");
      String [] secondArr = scanner.nextLine().split(" ");


        for (String s : secondArr) {
            for (String s1 : firstArr) {

                if (s1.equals(s)) {
                    System.out.print(s + " ");//.trim(0); trie space sled posledno

                }

            }

        }

        }
    }

