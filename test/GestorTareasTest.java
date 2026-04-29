package test;

import model.TareaNormal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.GestorTareas;

import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

    private GestorTareas gestor;

    @BeforeEach
    public void setUp() {

        gestor = new GestorTareas();
    }

    @Test
    public void agregarTareaTest() {

        gestor.agregarTarea(
            new TareaNormal("Estudiar Java", "Alta")
        );

        assertEquals(1, gestor.getTareas().size());
    }

    @Test
    public void completarTareaTest() {

        TareaNormal tarea = new TareaNormal(
            "Proyecto Java",
            "Alta"
        );

        gestor.agregarTarea(tarea);

        gestor.marcarComoCompletada(
            tarea.getId()
        );

        assertTrue(tarea.isCompletado());
    }

    @Test
    public void eliminarTareaTest() {

        TareaNormal tarea = new TareaNormal(
            "Eliminar tarea",
            "Media"
        );

        gestor.agregarTarea(tarea);

        gestor.eliminarTarea(
            tarea.getId()
        );

        assertEquals(0, gestor.getTareas().size());
    }
}
