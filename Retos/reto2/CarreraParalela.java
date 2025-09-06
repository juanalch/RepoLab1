package Retos.reto2;
 
import java.util.*;
import java.util.function.Function;
 
public class CarreraParalela {
 
    public static void main(String[] args) {
        // ====== Punto de partida ======
        List<Integer> lista1 = Arrays.asList(10, 20, 5, 7, 30);
        List<Integer> lista2 = Arrays.asList(3, 9, 12, 1, 25, 40);

        Map<String, Map<String,Object>> resultados = calcularResultadosParaDosListas(lista1, lista2);

        System.out.println("Resultados lista1 -> " + resultados.get("lista1"));
        System.out.println("Resultados lista2 -> " + resultados.get("lista2"));
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
    
    // ===== calcularResultados (unificada después del primer choque) =====
    public static Map<String,Object> calcularResultados(List<Integer> lista) {
        int max = maxOf(lista);
        Map<String,Integer> myc = minYConteo(lista);
        int min = myc.get("min");
        int count = myc.get("count"); 
    
        boolean maxMultiploDe2 = (max % 2 == 0) ? true : false;
        boolean maxDivisorDe2 = (max != 0 && (2 % max == 0)) ? true : false;
        String parity = (count % 2 == 0) ? "par" : "impar";

        Map<String,Object> res = new LinkedHashMap<>();
        res.put("max", max);
        res.put("min", min);
        res.put("count", count);

        res.put("maxMultiploDe2", maxMultiploDe2);
        res.put("maxDivisorDe2", maxDivisorDe2);
        res.put("countParImpar", parity);
        res.put("countEsPar", (count % 2 == 0) ? true : false); 
        res.put("countEsImpar", (count % 2 != 0) ? true : false);     
        return res;
        
    }

        // ===== calcularResultadosParaDosListas (meta final) =====
    public static Map<String, Map<String,Object>> calcularResultadosParaDosListas(List<Integer> l1, List<Integer> l2) {
        Map<String, Map<String,Object>> out = new LinkedHashMap<>();
        out.put("lista1", calcularResultados(l1));
        out.put("lista2", calcularResultados(l2));
        return out;
    }


}
