import java.util.Date;
import java.util.List;

public class Reserva {
    private Date fecha; // Fecha de la reserva
    private String horaInicio;
    private String horaFin;
    private Socio socio; // Socio que realiza la reserva
    private InstalacionDeportiva instalacion; // Instalación reservada
    private List<ArticuloDeportivo> listaArticulos; // Artículos alquilados

    public Reserva(Date fecha, String horaInicio, String horaFin, Socio socio, InstalacionDeportiva instalacion, List<ArticuloDeportivo> listaArticulos) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.socio = socio;
        this.instalacion = instalacion;
        this.listaArticulos = listaArticulos;
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public InstalacionDeportiva getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(InstalacionDeportiva instalacion) {
        this.instalacion = instalacion;
    }

    public List<ArticuloDeportivo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<ArticuloDeportivo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", horaInicio='" + horaInicio + '\'' +
                ", horaFin='" + horaFin + '\'' +
                ", socio=" + socio +
                ", instalacion=" + instalacion +
                ", listaArticulos=" + listaArticulos +
                '}';
    }
}

