import java.util.ArrayList;

public class Main {
    public static void cambiarEstado(ArrayList<Boolean> estados, int posicion) {

        boolean estadoActual = estados.get(posicion);
        estados.set(posicion, !estadoActual);
    }

    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();
        ArrayList<Boolean> completadas = new ArrayList<>();

        tareas.add("Estudiar para el examen");
        completadas.add(false); // Empieza como pendiente (false)

        tareas.add("Configurar el servidor");
        completadas.add(false);

        System.out.println("Tarea: " + tareas.get(0) + " | ¿Completada?: " + completadas.get(0));

        cambiarEstado(completadas, 0);

        System.out.println("Tarea: " + tareas.get(0) + " | ¿Completada?: " + completadas.get(0));
    }
}