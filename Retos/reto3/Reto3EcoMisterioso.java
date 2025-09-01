package Retos.reto3;

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

    

    public static void main(String[] args) {
        String mensaje = "Hola cueva";
        System.out.println("Repetir con StringBuilder: " + repetirConStringBuilder(mensaje));
        
    }
}