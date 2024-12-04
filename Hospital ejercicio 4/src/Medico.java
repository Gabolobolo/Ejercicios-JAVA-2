public class Medico {
    private String cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String servicio;

    // Constructor
    public Medico(String cedula, String nombre, String apellido, String especialidad, String servicio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.servicio = servicio;
    }

    // Método toString para mostrar información del médico
    @Override
    public String toString() {
        return "Medico{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", servicio='" + servicio + '\'' +
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

