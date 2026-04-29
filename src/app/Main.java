package app;

import service.GestorTareas;
import model.TareaNormal;
import model.TareaUrgente;

import java.util.Scanner;

/**
 * Clase principal SmartTask
 * Permite administrar tareas desde consola.
 *
 * @author Daniela Paz Bernales Miranda
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestorTareas gestor = new GestorTareas();

        int opcion;

        do {

            System.out.println("\n===== SMART TASK =====");
            System.out.println("1. Agregar tarea normal");
            System.out.println("2. Agregar tarea urgente");
            System.out.println("3. Listar tareas");
            System.out.println("4. Marcar tarea completada");
            System.out.println("5. Eliminar tarea");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre tarea: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Prioridad: ");
                    String prioridad = scanner.nextLine();

                    gestor.agregarTarea(
                        new TareaNormal(nombre, prioridad)
                    );

                    break;

                case 2:

                    System.out.print("Nombre tarea urgente: ");
                    String nombreUrgente = scanner.nextLine();

                    gestor.agregarTarea(
                        new TareaUrgente(nombreUrgente, "ALTA")
                    );

                    break;

                case 3:

                    gestor.listarTareas();

                    break;

                case 4:

                    System.out.print("ID tarea: ");
                    int idCompletar = scanner.nextInt();

                    gestor.marcarComoCompletada(idCompletar);

                    break;

                case 5:

                    System.out.print("ID tarea eliminar: ");
                    int idEliminar = scanner.nextInt();

                    gestor.eliminarTarea(idEliminar);

                    break;

                case 0:

                    System.out.println("Saliendo de SmartTask...");

                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
