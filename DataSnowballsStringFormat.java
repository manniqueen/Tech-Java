
import java.util.Scanner;


public class DataSnowballsStringFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
       long highestSnowBall =0;
       int snowBallSnowOutput =0;
       int snowBallTimeOutput =0;
       int snowBallQualityOutput =0;
       String output = "";

        for (int i = 0; i <n ; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());



            long snowBallValue =(long)Math.pow(snowBallSnow /snowBallTime,snowBallQuality);

            if ( snowBallValue > highestSnowBall){
                highestSnowBall =  snowBallValue;
                snowBallSnowOutput = snowBallSnow;
                snowBallTimeOutput =snowBallTime;
                snowBallQualityOutput = snowBallQuality;

                output = String.format("%s : %s = %s (%s)",
                        snowBallSnowOutput, snowBallTimeOutput, highestSnowBall,snowBallQualityOutput);




            }

        }

        System.out.println(output);


    }
}
