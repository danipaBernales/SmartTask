package service;

import model.Tarea;

public interface Accionable {

    void agregarTarea(Tarea tarea);

    void listarTareas();

    void marcarComoCompletada(int id);

    void eliminarTarea(int id);
}
