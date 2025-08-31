
import java.util.*;
public class Reto1Bienvenida {
    public static void main(String[] args) {
        List<Estudiante> pareja = Arrays.asList(
            new Estudiante("Juana Lozano Chaves", 19, "juana.lozano-c@mail.escueling.edu.co", 6),
            new Estudiante("Laura Alejandra Venegas Piraban", 20, "laura.venegas-p@mail.escuelaing.edu.co", 5)
        );

        String mensaje = Mensaje.generarMensaje(pareja);
        System.out.println(mensaje);
    }
}