package lab6;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {
    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        Map<V, K> reversed = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Map<Integer, String> reversed = reverseMap(map);
        System.out.println("Перевернутая Map: " + reversed);
    }
}