import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LChangeList100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" +"))
                        .map(Integer :: parseInt)
                        .collect(Collectors.toList());



        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")){
            String [] tokens = command.split(" +");
            String type = tokens [0];
            int element = Integer.parseInt(tokens [1]);


            if (type.equalsIgnoreCase("Delete")){
                while (numbers.contains(element)) {
                    int index = numbers.indexOf(element);
                    if (index != -1) {
                        numbers.remove(index);
                    }
                }

            }else if (type.equalsIgnoreCase("Insert")){
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                }

            }

            command = scanner.nextLine();
        }


        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i)+ " ");

        }
    }
}
