import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Socio> socios = new ArrayList<>();
    private static List<InstalacionDeportiva> instalaciones = new ArrayList<>();
    private static List<ArticuloDeportivo> articulos = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar socio");
            System.out.println("2. Registrar instalación deportiva");
            System.out.println("3. Registrar artículo deportivo");
            System.out.println("4. Crear reserva");
            System.out.println("5. Ver reservas");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarSocio();
                    break;
                case 2:
                    registrarInstalacion();
                    break;
                case 3:
                    registrarArticulo();
                    break;
                case 4:
                    crearReserva();
                    break;
                case 5:
                    verReservas();
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarSocio() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Cuota: ");
        double cuota = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Socio socio = new Socio(nombre, cedula, direccion, ciudad, provincia, telefono, cuota);
        socios.add(socio);
        System.out.println("Socio registrado exitosamente.");
    }

    private static void registrarInstalacion() {
        System.out.print("Tipo de instalación (piscina, gimnasio, etc.): ");
        String tipo = scanner.nextLine();
        System.out.print("Código de instalación: ");
        String codigo = scanner.nextLine();

        InstalacionDeportiva instalacion = new InstalacionDeportiva(tipo, codigo);
        instalaciones.add(instalacion);
        System.out.println("Instalación registrada exitosamente.");
    }

    private static void registrarArticulo() {
        System.out.print("Tipo de artículo (balón, raqueta, etc.): ");
        String tipo = scanner.nextLine();
        System.out.print("Cantidad disponible: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        ArticuloDeportivo articulo = new ArticuloDeportivo(tipo, cantidad);
        articulos.add(articulo);
        System.out.println("Artículo registrado exitosamente.");
    }

    private static void crearReserva() {
        try {
            System.out.println("Seleccione un socio:");
            for (int i = 0; i < socios.size(); i++) {
                System.out.println((i + 1) + ". " + socios.get(i).getNombre());
            }
            int socioIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir el salto de línea
            Socio socio = socios.get(socioIndex);

            System.out.println("Seleccione una instalación:");
            for (int i = 0; i < instalaciones.size(); i++) {
                System.out.println((i + 1) + ". " + instalaciones.get(i).getTipo());
            }
            int instalacionIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir el salto de línea
            InstalacionDeportiva instalacion = instalaciones.get(instalacionIndex);

            List<ArticuloDeportivo> articulosReservados = new ArrayList<>();
            System.out.println("Seleccione artículos (0 para terminar):");
            for (int i = 0; i < articulos.size(); i++) {
                System.out.println((i + 1) + ". " + articulos.get(i).getTipo());
            }
            int articuloIndex;
            do {
                articuloIndex = scanner.nextInt() - 1;
                if (articuloIndex >= 0 && articuloIndex < articulos.size()) {
                    articulosReservados.add(articulos.get(articuloIndex));
                }
            } while (articuloIndex >= 0 && articuloIndex < articulos.size());
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Fecha de reserva (dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = sdf.parse(fechaStr);

            System.out.print("Hora de inicio (HH:mm): ");
            String horaInicio = scanner.nextLine();
            System.out.print("Hora de fin (HH:mm): ");
            String horaFin = scanner.nextLine();

            Reserva reserva = new Reserva(fecha, horaInicio, horaFin, socio, instalacion, articulosReservados);
            reservas.add(reserva);
            System.out.println("Reserva creada exitosamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al crear la reserva: " + e.getMessage());
        }
    }

    private static void verReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            System.out.println("Lista de reservas:");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}


