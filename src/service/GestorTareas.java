package service;

import model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas implements Accionable {

    private List<Tarea> tareas;

    public GestorTareas() {

        tareas = new ArrayList<>();
    }

    @Override
    public void agregarTarea(Tarea tarea) {

        tareas.add(tarea);

        System.out.println("Tarea agregada correctamente");
    }

    @Override
    public void listarTareas() {

        if (tareas.isEmpty()) {

            System.out.println("No hay tareas registradas");

            return;
        }

        for (Tarea tarea : tareas) {

            System.out.println(tarea);
        }
    }

    @Override
    public void marcarComoCompletada(int id) {

        for (Tarea tarea : tareas) {

            if (tarea.getId() == id) {

                tarea.setCompletado(true);

                System.out.println("Tarea completada");

                return;
            }
        }

        System.out.println("Tarea no encontrada");
    }

    @Override
    public void eliminarTarea(int id) {

        boolean eliminada = tareas.removeIf(
            tarea -> tarea.getId() == id
        );

        if (eliminada) {

            System.out.println("Tarea eliminada correctamente");

        } else {

            System.out.println("Tarea no encontrada");
        }
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
