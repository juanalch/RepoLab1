package Retos.reto6;
public class MaquinaDecisiones {
 
    private final Map<String, Runnable> comandos = new HashMap<>();
 
    public MaquinaDecisiones() {
        registrarComandos();
    }
 
    private void registrarComandos() {
        // Fragmento Aleja
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
 
        // Fragmento Juana
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }
 
    public void ejecutarComando(String comando) {
        switch (comando) {
            // Aleja
            case "SALUDAR", "DESPEDIR", "CANTAR", "DANZAR",
            // Juana
                 "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR" -> comandos.get(comando).run();
            default -> System.out.println("Comando no reconocido: " + comando);
        }
    }
}