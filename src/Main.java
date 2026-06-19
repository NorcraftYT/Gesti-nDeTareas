import java.util.ArrayList;

public class Main {

    public static void cambiarEstado(ArrayList<Boolean> estados, int posicion) {
        boolean estadoActual = estados.get(posicion);
        estados.set(posicion, !estadoActual);
    }

    public static void eliminarTarea(ArrayList<String> tareas, ArrayList<Boolean> estados, int posicion) {
        tareas.remove(posicion);
        estados.remove(posicion);
    }

    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        ArrayList<Boolean> completadas = new ArrayList<>();

        tareas.add("Estudiar para el examen");
        completadas.add(false);

        tareas.add("Configurar el servidor");
        completadas.add(false);

        System.out.println("Lista antes de borrar: " + tareas);

        eliminarTarea(tareas, completadas, 0);

        System.out.println("Lista después de borrar: " + tareas);
    }
}