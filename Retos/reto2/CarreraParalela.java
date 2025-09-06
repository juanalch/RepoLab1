package Retos.reto2;

import java.util.*;
import java.util.function.Function;

public class CarreraParalela {

    public static void main(String[] args) {
        // ====== Punto de partida ======
        List<Integer> lista1 = Arrays.asList(10, 20, 5, 7, 30);
        List<Integer> lista2 = Arrays.asList(3, 9, 12, 1, 25, 40);

    }
    // ===== Carril 1: máximo con lambda =====
    public static java.util.function.Function<List<Integer>, Integer> maxLambda =
        lista -> lista.stream()
                    .max(Integer::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));

    public static int maxOf(List<Integer> lista) {
        return maxLambda.apply(lista);
    }

    // ===== Carril 2: mínimo y conteo con lambda =====
    public static Map<String,Integer> minYConteo(List<Integer> lista) {
        int min = lista.stream()
                    .min(Integer::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
        int count = lista.size(); // más directo y eficiente
        Map<String,Integer> r = new HashMap<>();
        r.put("min", min);
        r.put("count", count);
        return r;
}

    // ===== Función de choque (carril 2) =====
    public static Map<String,Object> calcularResultados(List<Integer> lista) {
        Map<String,Integer> myc = minYConteo(lista);
        int max = lista.stream().max(Integer::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
        Map<String,Object> res = new LinkedHashMap<>();
        // mismo contenido lógico pero diferente orden / variable -> provoca conflicto
        res.put("min", myc.get("min"));
        res.put("max", max);
        res.put("count", myc.get("count"));
        return res;
    }







}
