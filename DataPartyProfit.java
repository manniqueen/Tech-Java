import java.util.Scanner;

public class DataPartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coins = days * 50;

        for (int i = 1; i <= days ; i++) {
            if (i % 10 == 0){
                partySize -= 2;
            }
            if (i % 15 == 0){
                partySize += 5;
            }
            if (i % 3 == 0){
                coins -= partySize * 3;
            }
            if (i % 5 == 0){
                coins += 20 * partySize;

                if (i % 3 == 0){
                    coins -= partySize * 2;
                }
            }

            coins -= partySize * 2;

        }
        System.out.printf("%d companions received %d coins each.",
                partySize, coins / partySize);
    }
}
