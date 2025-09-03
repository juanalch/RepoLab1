package Retos.reto5;

import java.util.*;
import java.util.stream.*;

public class BatallaDeConjuntos {

    // Estudiante A
    public static Set<Integer> hashSetSinMultiplosDe3(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet()); // HashSet por defecto
    }

    // Estudiante B

    public static Set<Integer> treeSetSinMultiplosDe5(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new)); // mantiene orden natural
    }

 
    
}
