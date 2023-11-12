
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("B", "BB"),
                new AbstractMap.SimpleEntry<String, String>("E", "EE"),
                new AbstractMap.SimpleEntry<String, String>("D", "DD"),
                new AbstractMap.SimpleEntry<String, String>("A", "AA"),
                new AbstractMap.SimpleEntry<String, String>("C", "CC"),
                new AbstractMap.SimpleEntry<String, String>("Z", "ZZ"),
                new AbstractMap.SimpleEntry<String, String>("F", "FF"),
                new AbstractMap.SimpleEntry<String, String>("X", "XX"),
                new AbstractMap.SimpleEntry<String, String>("Y", "YY"),
                new AbstractMap.SimpleEntry<String, String>("S", "SS"),
                new AbstractMap.SimpleEntry<String, String>("L", "LL"),
                new AbstractMap.SimpleEntry<String, String>("N", "NN"),
                new AbstractMap.SimpleEntry<String, String>("H", "HH"),
                new AbstractMap.SimpleEntry<String, String>("G", "GG"),
                new AbstractMap.SimpleEntry<String, String>("O", "OO"),
                new AbstractMap.SimpleEntry<String, String>("P", "PP"),
                new AbstractMap.SimpleEntry<String, String>("Q", "QQ"),
                new AbstractMap.SimpleEntry<String, String>("W", "WW"),
                new AbstractMap.SimpleEntry<String, String>("M", "MM"),
                new AbstractMap.SimpleEntry<String, String>("J", "JJ"),
                //these will give more chance the map is not ordered
                new AbstractMap.SimpleEntry<String, String>("QQ", "QQ"),
                new AbstractMap.SimpleEntry<String, String>("QQQ", "QQQ"),
                new AbstractMap.SimpleEntry<String, String>("QQQQ", "QQQQ"),
                new AbstractMap.SimpleEntry<String, String>("QQQQQ", "QQQQQ"),
                new AbstractMap.SimpleEntry<String, String>("QQQQQQ", "QQQQQQ")
                ));
        map1.forEach((key, value) -> System.out.println("map1: [" + key + ":" + value + "]"));
        System.out.println("------------------------------");
        Map<String, String> sorted = map1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        sorted.forEach((key, value) -> System.out.println("sorted: [" + key + ":" + value + "]"));
    }
};