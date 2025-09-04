package Retos.reto4;

import java.util.*;
import java.util.stream.Collectors;


public class Reto4Tesoro {

    public static Map<String, Integer> createMap(List<Map.Entry<String, Integer>> entries) {
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
        merged.putAll(hashTable); // si hay conflicto, Hashtable sobrescribe
        return merged;
    }

    
}
