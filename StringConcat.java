import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        String s = "Strings are immutable";
        s = s.concat(" all the time");
        System.out.println(s);
    }
}
