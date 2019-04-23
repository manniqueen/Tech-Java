import java.util.Scanner;

public class ArraysFootballResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strFootballResult = scanner.nextLine();
        String[] goals = strFootballResult.split(":");

        int firstTeamGoals = Integer.parseInt(goals[0]);
        int secondTeamGoals = Integer.parseInt(goals[1]);

        int wins = 0;
        int draws = 0;
        int losts = 0;

        if (firstTeamGoals > secondTeamGoals) {
            wins++;
        } else if (firstTeamGoals < secondTeamGoals) {
            losts++;
        } else {
            draws++;
        }

        String strFootballResult2 = scanner.nextLine();
        String[] goals2 = strFootballResult2.split(":");

        int firstTeamGoals2 = Integer.parseInt(goals2[0]);
        int secondTeamGoals2 = Integer.parseInt(goals2[1]);


        if (firstTeamGoals2 > secondTeamGoals2) {
            wins++;
        } else if (firstTeamGoals2 < secondTeamGoals2) {
            losts++;
        } else {
            draws++;
        }

        String strFootballResult3 = scanner.nextLine();
        String[] goals3 = strFootballResult3.split(":");

        int firstTeamGoals3 = Integer.parseInt(goals3[0]);
        int secondTeamGoals3 = Integer.parseInt(goals3[1]);

        if (firstTeamGoals3 > secondTeamGoals3) {
            wins++;
        } else if (firstTeamGoals3 < secondTeamGoals3) {
            losts++;
        } else {
            draws++;
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losts);
        System.out.printf("Drawn games: %d%n", draws);
    }
}