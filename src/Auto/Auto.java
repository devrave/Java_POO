package Auto;

public class Auto {
    private String marca, modelo;
    private int anio, kilometraje;

    public Auto() {
        this.kilometraje = 0;
    }

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void mostrarInformacion() {
        System.out.printf("Marca: %s, Modelo: %s, Año es: %d.", this.marca, this.modelo, this.anio);
    }

    //sobreescribir metodo para información detallada
    public void mostrarInformacion(boolean detallada){
        //llamamos a nuestra funcion original
        mostrarInformacion();
        if(detallada){
            System.out.printf(" El kilometate del vehiculo es: %d: " , this.kilometraje);
        }
    }

    public void actualizarKilometraje(int kilometros){
        if(kilometros <= 0)
            System.out.println("Ingrese valor mayor a 0");
        else {
            this.kilometraje += kilometros;
            System.out.println("Kilometraje actualizado.");
        }
    }

}




