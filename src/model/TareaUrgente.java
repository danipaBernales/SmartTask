package model;

public class TareaUrgente extends Tarea {

    public TareaUrgente(String nombre, String prioridad) {
        super(nombre, prioridad);
    }

    @Override
    public String toString() {

        return "[URGENTE] " + super.toString();
    }
}
