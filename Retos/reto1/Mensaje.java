import java.util.stream.Collectors;
import java.util.*;


public class Mensaje {
    public static String generarMensaje(List<Estudiante> estudiantes) {
        // Usar stream para transformar la lista en partes del mensaje
        String parteNombres = estudiantes.stream()
            .map(est -> est.nombre + " estudiante de la escuela de " + est.semestre + " semestre de " + est.edad + " años")
            .collect(Collectors.joining(" y "));

        String parteCorreos = estudiantes.stream()
            .map(est -> est.correo)
            .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " + parteNombres
                + ", nuestros correos institucionales son " + parteCorreos;
    }
}