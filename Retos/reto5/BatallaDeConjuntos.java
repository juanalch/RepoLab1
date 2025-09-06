package Retos.reto5;

import java.util.*;
import java.util.stream.*;

public class BatallaDeConjuntos {

    // Estudiante A
    public static Set<Integer> hashSetSinMultiplosDe3(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet()); 
    }

    // Estudiante B
    public static Set<Integer> treeSetSinMultiplosDe5(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new)); 
    }
    // Choque
    public static Set<Integer> unirYOrdenar(Set<Integer> conj1, Set<Integer> conj2) {
        return Stream.concat(conj1.stream(), conj2.stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        // Ejemplo de números aleatorios para cada conjunto
        Set<Integer> conjuntoHash = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> conjuntoTree = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        Set<Integer> filtradoHash = hashSetSinMultiplosDe3(conjuntoHash);
        Set<Integer> filtradoTree = treeSetSinMultiplosDe5(conjuntoTree);

        Set<Integer> union = unirYOrdenar(filtradoHash, filtradoTree);

        union.forEach(n -> System.out.println("Número en arena: " + n));
    }

}
