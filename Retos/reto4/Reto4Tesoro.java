package Retos.reto4;

import java.util.*;
import java.util.stream.Collectors;


public class Reto4Tesoro {
    
    public static Map<String, Integer> createHashMap(List<Map.Entry<String, Integer>> entries) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            map.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return map;
    } 
    
}
