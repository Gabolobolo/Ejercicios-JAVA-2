public class Socio extends Persona {
    private double cuota;

    public Socio(String nombre, String cedula, String direccion, String ciudad, String provincia, String telefono, double cuota) {
        super(nombre, cedula, direccion, ciudad, provincia, telefono);
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
}