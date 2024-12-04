public class Paciente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String numeroHistoriaClinica;

    // Constructor
    public Paciente(String cedula, String nombre, String apellido, String numeroHistoriaClinica) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    // Método toString para mostrar información del paciente
    @Override
    public String toString() {
        return "Paciente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroHistoriaClinica='" + numeroHistoriaClinica + '\'' +
                '}';
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

