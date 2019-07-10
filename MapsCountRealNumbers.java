import java.util.*;

public class MapsCountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .mapToDouble(Double:: parseDouble).toArray();

        Map<Double,Integer> someMap = new TreeMap<>();

        for (double number : numbers) {
            if(!someMap.containsKey(number)){
                someMap.put(number, 0);
            }

            int oldValue = someMap.get(number);
            someMap.put(number,oldValue + 1);
        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double, Integer> doubleIntegerEntry : someMap.entrySet()) {
            System.out.println(String.format(pattern,doubleIntegerEntry.getKey(),
                    doubleIntegerEntry.getValue()));

        }


    }


}
