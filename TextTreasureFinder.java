import java.util.*;
import java.util.stream.Collectors;


public class TextTreasureFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String stringToEncrypt = scanner.nextLine();
        int keyIndex = 0;

        while (!"find".equals(stringToEncrypt)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stringToEncrypt.length(); i++) {

                sb.append((char) (stringToEncrypt.charAt(i) - keys[keyIndex]));

                if (keyIndex >= keys.length - 1) {
                    keyIndex = 0;
                } else {
                    keyIndex++;
                }
            }
            String sbToStr = sb.toString();

            int materialStartIndex = sbToStr.indexOf("&")+1;
            int materialEndIndex = sbToStr.indexOf("&", materialStartIndex + 1);
            int coordinatesStartIndex = sbToStr.indexOf("<")+1;
            int coordinatesEndIndex = sbToStr.indexOf(">");
            String material = sbToStr.substring(materialStartIndex,materialEndIndex);
            String coordinates = sbToStr.substring(coordinatesStartIndex,coordinatesEndIndex);

            System.out.printf("Found %s at %s\n",material,coordinates);
            stringToEncrypt = scanner.nextLine();
            keyIndex = 0;
        }

    }
}