package CuentaBancancaria;

public class Main {
    public static void main(String[] args) {

        //Instanciar
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setSaldo(300);
        cuentaBancaria.setNumeroCuenta("3434");
        cuentaBancaria.setTipoCuenta("corriente");
        cuentaBancaria.setNombreTitular("Andres Cano");
        //Informacion inicial
        cuentaBancaria.mostrarDatos();
        //depositar
        cuentaBancaria.depositar(23);
        // retirar
        cuentaBancaria.retirar(20);
        cuentaBancaria.mostrarDatos();
        // Instanciar usando el constructor lleno
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("3434","Andres Cano",300,"Corriente");
        // Depositar y retirar
        cuentaBancaria1.depositar(23);
        cuentaBancaria1.retirar(20);

        // Mostrar datos finales
        cuentaBancaria1.mostrarDatos();
    }
}
