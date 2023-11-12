import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "AA");
        map1.put("B", "BB");
        map1.put("C", "CC");
        map1.put("D", "DD");
        map1.put("E", "EE");
        map1.put("F", "FF");
        Map<String, String> map2 = new HashMap<>(Map.of("A", "AA", "B", "BB", "C", "CC", "D", "DD", "E", "EE"));

        Map<String, String> map3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("A", "AA"),
                new AbstractMap.SimpleEntry<String, String>("B", "BB"),
                new AbstractMap.SimpleEntry<String, String>("C", "CC"),
                new AbstractMap.SimpleEntry<String, String>("D", "DD"),
                new AbstractMap.SimpleEntry<String, String>("E", "EE")));
        map1.forEach((key, value) -> System.out.println("map1: [" + key + ":" + value + "]"));
        System.out.println("------------------------------");
        map2.forEach((key, value) -> System.out.println("map2: [" + key + ":" + value + "]"));
        System.out.println("------------------------------");
        map3.forEach((key, value) -> System.out.println("map3: [" + key + ":" + value + "]"));
    }
};