import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void registrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente registrado: " + c);
    }

    public void registrarLibro(Libro l) {
        libros.add(l);
        System.out.println("Libro registrado: " + l);
    }

    public void realizarPrestamo(Usuario u, Libro l) {
        if (!l.isDisponible()) {
            System.out.println("El libro no está disponible.");
            return;
        }
        Prestamo p = new Prestamo(l, u);
        prestamos.add(p);
        l.setDisponible(false);
        System.out.println("Préstamo realizado: " + p);
    }
}