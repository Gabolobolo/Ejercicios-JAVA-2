public class ArticuloDeportivo {
    private String tipo; // Ejemplo: balón, raqueta, etc.
    private int cantidadDisponible; // Cantidad disponible para alquilar

    public ArticuloDeportivo(String tipo, int cantidadDisponible) {
        this.tipo = tipo;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "ArticuloDeportivo{" +
                "tipo='" + tipo + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}

