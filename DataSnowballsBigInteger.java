import java.math.BigInteger;

import java.util.Scanner;



public class DataSnowballsBigInteger{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        BigInteger highestSnowBall = BigInteger.valueOf(0);

        String output = "";



        for (int i = 0; i < n; i++) {

            int snowBallSnow = Integer.parseInt(scanner.nextLine());

            int snowBallTime = Integer.parseInt(scanner.nextLine());

            int snowBallQuality = Integer.parseInt(scanner.nextLine());



            int formula = snowBallSnow / snowBallTime;



            BigInteger snowBallValue = BigInteger.valueOf(formula).pow(snowBallQuality);



            if (highestSnowBall.compareTo(snowBallValue) < 0) {

                highestSnowBall = snowBallValue;

                output = String.format("%s : %s = %s (%s)", snowBallSnow, snowBallTime, snowBallValue, snowBallQuality);

            }

        }

        System.out.println(output);

    }

}