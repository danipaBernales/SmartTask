package model;

/**
 * Clase abstracta Tarea
 */
public abstract class Tarea {

    private static int contador = 1;

    protected int id;
    protected String nombre;
    protected String prioridad;
    protected boolean completado;

    public Tarea(String nombre, String prioridad) {

        this.id = contador++;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {

        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Prioridad: " + prioridad +
                " | Estado: " +
                (completado ? "Completada" : "Pendiente");
    }
}
