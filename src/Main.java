public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador(1, "Carlos", "carlos@biblioteca.com");
        Cliente cliente = new Cliente(2, "Laura", "laura@gmail.com");
        admin.registrarCliente(cliente);

        Libro libro = new Libro("123456789", "Cien años de soledad", "Gabriel García Márquez");
        admin.registrarLibro(libro);

        admin.realizarPrestamo(cliente, libro);
    }
}