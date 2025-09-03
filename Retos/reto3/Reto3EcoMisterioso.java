package Retos.reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto3EcoMisterioso {

    // Estudiante A
    public static String repetirConStringBuilder(String mensaje) {
        StringBuilder sb = new StringBuilder();
        // Usar stream para repetir 3 veces
        String resultado = Stream.generate(() -> mensaje)
                                .limit(3)
                                .collect(Collectors.joining(" "));
        sb.append(resultado);
        return sb.toString();
    }
     // Estudiante B: método con StringBuffer que invierte el mensaje
    public static String invertirConStringBuffer(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
     // Función combinada: repetir 3 veces y luego invertir el resultado
    public static String repetirYInvertir(String mensaje) {
        // Repetir 3 veces con stream (como hizo A)
        String repetido = Stream.generate(() -> mensaje)
                                .limit(3)
                                .collect(Collectors.joining(" "));
        // Invertir con StringBuffer (como hizo B)
        StringBuffer sb = new StringBuffer(repetido);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        // Lambda para invocar la función combinada
        Function<String, String> ecoMisterioso = Reto3EcoMisterioso::repetirYInvertir;

        String mensaje = "Hola cueva";

        System.out.println("Repetir con StringBuilder: " + repetirConStringBuilder(mensaje));
        System.out.println("Invertir con StringBuffer: " + invertirConStringBuffer(mensaje));
        System.out.println("Repetir y luego invertir combinado: " + ecoMisterioso.apply(mensaje));
    }
}