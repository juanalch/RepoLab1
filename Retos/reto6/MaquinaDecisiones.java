package Retos.reto6;

public class MaquinaDecisiones {
    public void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR" -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
            case "GRITAR" -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
            case "SUSURRAR" -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos.");
            case "ANALIZAR" -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!");
            default -> System.out.println("Comando no reconocido: " + comando);
        }
    }


}
