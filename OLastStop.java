import java.util.*;
import java.util.stream.Collectors;

public class OLastStop {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        List<Integer> paintings = Arrays.stream(scanner.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.next();

        while (!command.equalsIgnoreCase("END")){

            if (command.equals("Change")){
                int paintingNumber = scanner.nextInt();
                int changedNumber = scanner.nextInt();

                for (int i = 0; i <paintings.size() ; i++) {
                    if (paintings.get(i) == paintingNumber ){
                        paintings.set(i, changedNumber);
                        break; //EDIT /////////////////////////////////////////////////////////////<-----------------
                    }
                }


            }else if (command.equals("Hide")){
                int paintingNumber = scanner.nextInt();
                while (paintings.contains(Integer.valueOf(paintingNumber))) {
                    paintings.remove(Integer.valueOf(paintingNumber));
                }


            }else if (command.equals("Switch")){
                int paintingNumber = scanner.nextInt();
                int paintingNumber2 = scanner.nextInt();
                int index1 = -1;
                int index2 = -1;
                for (int i = 0; i < paintings.size() ; i++) {
                    if (paintings.get(i) == paintingNumber){
                        index1 = i;
                    } else if (paintings.get(i) == paintingNumber2){
                        index2 = i;
                    }
                }

                if (index1 != -1 && index2 != -1 ){
                    paintings.set(index1,paintingNumber2);
                    paintings.set(index2, paintingNumber);
                }


            }else if (command.equals("Insert")){
                int place = scanner.nextInt();

                int paintingNumber = scanner.nextInt();
                if (place + 1 < paintings.size() && place + 1 >= 0){
                    paintings.add(place + 1,paintingNumber);
                }

            }else if (command.equals("Reverse")){
                Collections.reverse(paintings);

            }



            command = scanner.next();
        }

        for (int painting: paintings) {
            System.out.print(painting + " ");
        }
    }
}