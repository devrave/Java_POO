package CuentaBancancaria;

public class CuentaBancaria {

     private String numeroCuenta;
     private String  nombreTitular;
     private  double saldo;
     private String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
        }else {
            System.out.println("Tu saldo debe ser mayor a cero");
        }
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta.equalsIgnoreCase("Ahorros") || tipoCuenta.equalsIgnoreCase("Corriente")) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta inválido. Debe ser 'Ahorros' o 'Corriente");;
        }
    }
    public void depositar(double monto){
        if(monto > 0){
            this.saldo += monto;
        }else {
            System.out.println("Tu saldo debe ser mayor a cero");
        }
    }
    public void retirar(double monto){
        if (monto < saldo){
            this.saldo -= monto;
        }else {
            System.out.println("Fondos insuficientes");
        }
    }
    public void mostrarDatos(){
        if (tipoCuenta == null || tipoCuenta.isEmpty()) {
            System.out.println("Intentalo de nuevo");
        } else {
            System.out.println("Buena tarde, su saldo actual es de: $ " + saldo);
            System.out.println("Nombre del titular de la cuenta: " + nombreTitular);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.println("Número de cuenta: " + numeroCuenta);
            }
    }
}
