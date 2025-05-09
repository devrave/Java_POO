package Biblioteca;

public class Biblioteca {

    private String  titulo;
    private String autor;
    private int  anioPublicacion;
    private boolean disponible;


    public Biblioteca() {
    }

    public Biblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarDetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " +  anioPublicacion);
        System.out.println("Disponibilidad: " + disponible);
    }

    public void prestar() {
        if (disponible) {
            System.out.println("El libro ha sido prestado");
            disponible = false;
        }else {
            System.out.println("El libro no esta disponible");


        }
    }

    public void devolver(){
            System.out.println("Retomando libro");
            disponible = true;
    }

}


