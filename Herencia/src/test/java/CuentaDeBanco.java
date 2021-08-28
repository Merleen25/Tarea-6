public class CuentaDeBanco {
    String  numeroCuenta;
    String nombreCliente;
    int edadCliente;
    double monto;

    public CuentaDeBanco(String numeroCuenta, double monto) {
        this.numeroCuenta = numeroCuenta;
        this.monto = monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double deposito (double monto){
        this.monto= this.monto+monto;
        return this.monto;
    }
    //ejemplo @Override sobreescritura.
    public double retiro (double monto){
        this.monto= this.monto-monto;
        return this.monto;
    }
    // prueva coment
    // Ejemplo de Overloading o sobrecarga.
    public void actualizarDatos(int edad){
        this.edadCliente = edad;
    }
    public void actualizarDatos(String nombreCliente){

        this.nombreCliente = nombreCliente;
    }
    public void mostrarMonto(){
        System.out.println("su Balance actual es: " + monto);
    }
}
