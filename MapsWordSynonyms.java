import java.util.*;

public class MapsWordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, List <String>>words = new LinkedHashMap<>();

        for (int i = 0; i < num ; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            words.putIfAbsent(key, new ArrayList<>());
            words.get(key).add(value);
        }

        String pattern = "%s - %s";

        for (Map.Entry<String, List<String>> stringListEntry : words.entrySet()) {

            String key = stringListEntry.getKey();
            String value = String.join(", ",stringListEntry.getValue());
            System.out.println(String.format(pattern, key, value));


        }

    }
}
