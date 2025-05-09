package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    //Quiero que cada vez que ingrese un pedido se me incremente
    private static int contadorPedido = 1;

    private int numeroPedido;
    private String nombreCliente;
    private double total;
    private List<String> productos;

    public Pedidos(){
        this.numeroPedido = contadorPedido++;
        this.productos = new ArrayList<>();
    }

    public Pedidos(String nombreCliente){
        this.numeroPedido = contadorPedido++;
        this.nombreCliente = nombreCliente;
        this.total = 0.0;
        this.productos = new ArrayList<>();
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public List<String> getProductos() {
        return productos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getTotal() {
        return total;
    }

    public void agregarProductos(String producto, double precio){
        this.productos.add(producto);
        this.total += precio;
    }

    public void calcularDescuento(double porcentaje){
        if(porcentaje > 0 && porcentaje <= 100){
            System.out.printf("Descuento aplicdo de: %.2f", porcentaje);
        }else{
            System.out.println("Verifica que no sea negativo o mayor a 100");
        }
    }

    public void mostrarPedido() {
        System.out.println("Número de pedido: " + getNumeroPedido());
        System.out.println("Cliente: " + getNombreCliente());
        System.out.println("Productos:");
        for (String producto : getProductos()) {
            System.out.println("- " + producto);
        }
        System.out.printf("Total: %.2f\n", getTotal());
        System.out.println("---------------------------");
    }
}
