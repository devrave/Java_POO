package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Constructor vacio

        Pedidos pedidos = new Pedidos();
        pedidos.agregarProductos("chocolate",3000);
        pedidos.setNombreCliente("Alberto");
        pedidos.agregarProductos("Pandequeso",200);
        pedidos.agregarProductos("Pandebono",200);
        pedidos.agregarProductos("Pandeyuca",200);
        pedidos.mostrarPedido();
        System.out.println("**********PEDIDO DOS*******");

        //Constructor lleno
        Pedidos pedidos2 = new Pedidos("Juan");
        pedidos2.agregarProductos("Empanada", 300);
        pedidos2.agregarProductos("Buñuelo", 500);
        pedidos2.agregarProductos("Almojabana", 600);
        pedidos2.mostrarPedido();






    }
}
