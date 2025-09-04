package Retos.reto4;

import java.util.*;


public class Reto4Tesoro {
    public static Map<String, Integer> createMap(List<Map.Entry<String, Integer>> entries) {
        Map<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : entries) {
            table.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return table;
        }
}
