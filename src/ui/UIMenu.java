package ui;

import java.util.Scanner;

public class UIMenu {
    /**
     * Muestra el menu prinicpal del sistema de Citas Médicas
     * <p>La variable response se inicializa en 0 y es la encargada de almacenar la eleccion del usuario por consola usando la clase Scanner </p>
     * <p>El programa tiene el siguiente comportamiento</p>
     * <ol>
     *     <li>Lo lleva al menu Doctor</li>
     *     <li>Lo lleva al menu Paciente</li>
     *     <li>Termina el programa</li>
     * </ol>
     */
    public static void showMenu() {
        System.out.println("Citas médicas");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Gracias por la visita");
                    break;
                default:
                    System.out.println("Selecciona una opcion válida");
            }
        } while (response != 0);
    }

    /**
     * Muestra el menu Paciente
     * <p>La variable response se inicializa en 0 y es la encargada de almacenar la eleccion del usuario</p>
     * <p>El programa tiene el siguiente comportamiento</p>
     * <ol>
     *     <li>Lo lleva a registrar una cita</li>
     *     <li>Le muestra todas las citas agendadas</li>
     *     <li>Lo regresa al menu principal</li>
     * </ol>
     */
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Registrar una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Regresar al menu principal");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    System.out.println("::Registra una cita");
                    break;
                case 2:
                    System.out.println("::Mis citas");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion válida");

            }
        } while (response != 0);
    }
}
