public class CuentaAhorro extends CuentaDeBanco{
    public CuentaAhorro(String numeroCuenta, Double monto) {
        super(numeroCuenta, monto);
    }
    //ejemplo @override sobreescritura.
    @Override
    public double retiro (double monto){
        double penalizacion = 0.12;
        penalizacion= monto * penalizacion;
        this.monto= this.monto-monto;
        this.monto = this.monto - penalizacion;
        return this.monto;
    }
}
