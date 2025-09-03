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
    public static int maxOf(List<Integer> lista) {
        return lista.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
    }

        // ===== Soporte carril2 =====
    static class MinYConteo {
        final int min;
        final int count;
        MinYConteo(int min, int count) { this.min = min; this.count = count; }
    }

    // ===== Carril 2: mínimo y conteo con lambda =====
    public static MinYConteo minYConteo(List<Integer> lista) {
        int min = lista.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
        int count = (int) lista.stream().count();
        return new MinYConteo(min, count);
    }


}
