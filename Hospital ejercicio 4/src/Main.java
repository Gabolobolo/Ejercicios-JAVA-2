import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Medico> medicos = new ArrayList<>();
    private static List<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Médico");
            System.out.println("2. Registrar Paciente");
            System.out.println("3. Listar Médicos");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarMedico();
                    break;
                case 2:
                    registrarPaciente();
                    break;
                case 3:
                    listarMedicos();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para registrar un médico
    private static void registrarMedico() {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();
        System.out.print("Servicio: ");
        String servicio = scanner.nextLine();

        Medico medico = new Medico(cedula, nombre, apellido, especialidad, servicio);
        medicos.add(medico);
        System.out.println("Médico registrado exitosamente.");
    }

    // Método para registrar un paciente
    private static void registrarPaciente() {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Número de Historia Clínica: ");
        String numeroHistoriaClinica = scanner.nextLine();

        Paciente paciente = new Paciente(cedula, nombre, apellido, numeroHistoriaClinica);
        pacientes.add(paciente);
        System.out.println("Paciente registrado exitosamente.");
    }

    // Listar Médicos
    private static void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
        } else {
            for (Medico medico : medicos) {
                System.out.println(medico);
            }
        }
    }

    // Listar Pacientes
    private static void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println(paciente);
            }
        }
    }
}

