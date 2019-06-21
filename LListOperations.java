

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listArray = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] operation = scan.nextLine().toLowerCase().split("\\s+");

        while (!"end".equals(operation[0])) {
            if ("add".equals(operation[0])) {
                int number = Integer.parseInt(operation[1]);

                listArray.add(number);
            } else if ("insert".equals(operation[0])) {
                int number = Integer.parseInt(operation[1]);
                int position = Integer.parseInt(operation[2]);

                if (position < 0 || position > listArray.size()) {
                    System.out.println("Invalid index");
                } else {
                    listArray.add(position, number);
                }
            } else if ("remove".equals(operation[0])) {
                int index = Integer.parseInt(operation[1]);

                if (index < 0 || index >= listArray.size()) {
                    System.out.println("Invalid index");
                } else {
                    listArray.remove(index);
                }
            } else if ("shift".equals(operation[0])) {
                int count = Integer.parseInt(operation[2]);


                if ("left".equals(operation[1])) {
                    for (int i = 0; i < count; i++) {
                        listArray.add(listArray.get(0));
                        listArray.remove(0);
                    }
                } else if ("right".equals(operation[1])) {
                    for (int i = 0; i < count; i++) {
                        listArray.add(0,listArray.get(listArray.size() - 1));
                        listArray.remove(listArray.size() - 1);
                    }
                }
            }
            operation = scan.nextLine().toLowerCase().split("\\s+");
        }

        System.out.println(listArray.toString().replaceAll("[\\[\\],]", ""));
    }
}