import java.util.*;

public class MapConcert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String line = scanner.nextLine();

      Map<String,Integer> bandTime = new TreeMap<>();
      Map<String, List<String>> bandMembers = new LinkedHashMap<>();

      while (!line.equalsIgnoreCase("start of concert")){
          String [] tokens = line.split("; +");
          String command = tokens[0];
          String band = tokens[1];

          if (command.equalsIgnoreCase("Add")){
              String [] members = tokens[2].split(", +");

              if (!bandMembers.containsKey(band)){
                  bandMembers.put(band,new ArrayList<>());

                  for (String member : members) {
                      bandMembers.get(band).add(member);
                  }

              }else {
                  for (String member : members) {
                      if (!bandMembers.get(band).contains(member)){
                          bandMembers.get(band).add(member);
                      }

                  }

              }
          }

          if (command.equalsIgnoreCase("Play")){
              int time = Integer.parseInt(tokens[2]);
              bandTime.putIfAbsent(band,0);
              bandTime.put(band, bandTime.get(band) + time);
          }

          line = scanner.nextLine();
      }

      int totalTime = bandTime.values().stream().mapToInt(t -> t).sum();
        System.out.println("Total time: "+ totalTime);

        bandTime.entrySet().stream()
                .sorted((b1, b2) -> {
                    int compare = b2.getValue().compareTo(b1.getValue());
                    if(compare == 0){
                        b1.getKey().compareTo(b2.getKey());
                    }
                    return compare;
                })
                .forEach(b -> System.out.printf("%s -> %d%n", b.getKey(), b.getValue()));

        String band = scanner.nextLine();
        for (Map.Entry<String, List<String>> entry : bandMembers.entrySet()) {
            if (entry.getKey().equals(band)) {
                System.out.println(band);
                entry.getValue().forEach(mem -> System.out.println("=> " + mem));
            }
        }
    }
}
