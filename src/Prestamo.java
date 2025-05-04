import java.util.Date;

public class Prestamo {
    private Date fechaInicio;
    private Date fechaDevolucion;
    private String estado;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.fechaInicio = new Date();
        this.fechaDevolucion = null;
        this.estado = "activo";
        this.libro = libro;
        this.usuario = usuario;
    }

    public String toString() {
        return "Prestamo{fechaInicio=" + fechaInicio + ", estado='" + estado + "', libro=" + libro + ", usuario=" + usuario + "}";
    }
}