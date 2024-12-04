public class InstalacionDeportiva {
    private String tipo; // Ejemplo: piscina, gimnasio, etc.
    private String codigo; // Identificador único de la instalación

    public InstalacionDeportiva(String tipo, String codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "InstalacionDeportiva{" +
                "tipo='" + tipo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

