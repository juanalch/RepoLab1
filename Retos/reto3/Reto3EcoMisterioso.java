package Retos.reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto3EcoMisterioso {

    // Estudiante A
    public static String repetirConStringBuilder(String mensaje) {
        StringBuilder sb = new StringBuilder();
        
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

        String repetido = Stream.generate(() -> mensaje)
                                .limit(3)
                                .collect(Collectors.joining(" "));
        StringBuffer sb = new StringBuffer(repetido);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Function<String, String> ecoMisterioso = Reto3EcoMisterioso::repetirYInvertir;

        String mensaje = "Hola cueva";

        System.out.println("Repetir con StringBuilder: " + repetirConStringBuilder(mensaje));
        System.out.println("Invertir con StringBuffer: " + invertirConStringBuffer(mensaje));
        System.out.println("Repetir y luego invertir combinado: " + ecoMisterioso.apply(mensaje));
    }
}