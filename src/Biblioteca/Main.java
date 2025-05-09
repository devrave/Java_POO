package Biblioteca;

public class Main {
    public static void main(String[] args) {


        Biblioteca libro = new Biblioteca("Cien años de soledad", "Gabriel García Márquez", 1967);

        System.out.println("Información inicial del libro: ");
        libro.mostrarDetalles();
        System.out.println();

        // prestamo inicial
        System.out.println("Prestar libro primera vez:");
        libro.prestar();        // Marca como prestado
        libro.mostrarDetalles();
        System.out.println();

        // Intentar prestar libro nuevamente
        System.out.println("Prestar libro:");
        libro.prestar();
        libro.mostrarDetalles();
        System.out.println();

        // Devolver el libro
        System.out.println("Devolver el libro:");
        libro.devolver();
        libro.mostrarDetalles();
        System.out.println();

        // Intentar prestarlo nuevamente (ahora debe funcionar)
        System.out.println("Intentando prestar el libro nuevamente:");
        libro.prestar();
        libro.mostrarDetalles();
    }


}
