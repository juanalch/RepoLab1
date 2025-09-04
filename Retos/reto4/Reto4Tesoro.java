package Retos.reto4;

import java.util.*;

public class Reto4Tesoro {
    public static Map<String, Integer> createMapHashTable(List<Map.Entry<String, Integer>> entries) {
        Map<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : entries) {
            table.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return table;
        }

    public static Map<String, Integer> createMapHashMap(List<Map.Entry<String, Integer>> entries) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            map.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return map;
    } 


    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {
        Map<String, Integer> merged = new HashMap<>(hashMap);
        merged.putAll(hashTable); 
        return merged;
    }
}
