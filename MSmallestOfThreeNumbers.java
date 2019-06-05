import java.util.Scanner;

public class MSmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(biggest(a,b,c));

        //int minElememt = min (a,b);
        //System.out.println(min(minElement, c))

    }

    //static int min (int a, int b){
    // return Math.min (a,b);

    public static int biggest (int a,int b, int c){
        int biggestN=0;

        if (a <= b && a <= c){
           biggestN = a;

        }else if (b <= a && b <= c){
            biggestN = b;

        }else if (c <= a && c <= b){
           biggestN = c;
        }

        return biggestN;

    }
}
