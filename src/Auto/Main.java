package Auto;

public class Main {
    public static void main(String[] args) {

        // Constructor vacío
        Auto auto = new Auto();
        auto.setAnio(2022);
        auto.setModelo("2019");
        auto.setMarca("Mazda");
        System.out.println("*******Informacion normal*****");
        auto.mostrarInformacion();
        System.out.println("\n******Con Informacion detallada****");
        auto.actualizarKilometraje(0);
        auto.mostrarInformacion(true);
        System.out.println();
        //Constructor lleno
        System.out.println("*****Con Constructor*****");
        Auto auto1 = new Auto("Ford", "1990",1998);
        auto1.mostrarInformacion();
        System.out.println("\n");
        auto1.actualizarKilometraje(34);
        auto1.mostrarInformacion(true);



    }
}
