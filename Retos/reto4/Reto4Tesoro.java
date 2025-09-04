package Retos.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4Tesoro {
    public static Map<String, Integer> createMapHashtable(List<Map.Entry<String, Integer>> entries) {
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


   public static Map<String, Integer> mergeAndFormat(
            Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {

        // Paso 1: combinar ambos mapas (Hashtable tiene prioridad)
        Map<String, Integer> combined = new HashMap<>(hashMap);
        combined.putAll(hashTable);

        // Paso 2: pipeline con streams
        return combined.entrySet()
                .stream()
                // Aleja: transformar claves a mayúsculas
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(), e.getValue()))
                // Juana: ordenar por clave
                .sorted(Map.Entry.comparingByKey())
                // Recolectar a un LinkedHashMap para mantener el orden
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,       // en conflicto gana Hashtable
                        LinkedHashMap::new
                ));
    }

    /**
     * Imprime el mapa en formato Clave: X | Valor: Y
     */
    public static void printFormatted(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
    }

    /**
     * Main de prueba con los datos de ejemplo.
     */
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> entriesA = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<Map.Entry<String, Integer>> entriesB = Arrays.asList(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        // Aleja crea HashMap
        Map<String, Integer> hashMap = createMapHashMap(entriesA);

        // Juana crea Hashtable
        Map<String, Integer> hashTable = createMapHashtable(entriesB);

        // Versión final combinada
        Map<String, Integer> finalMap = mergeAndFormat(hashMap, hashTable);

        // Imprimir tesoro
        printFormatted(finalMap);
    }
}

