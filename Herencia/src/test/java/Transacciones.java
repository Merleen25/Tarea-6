public class Transacciones {
    public static void main(String arg[]){
        CuentaDeBanco cuentaBanco;
        CuentaAhorro ahorroUno;
        ahorroUno = new CuentaAhorro("89643",1500.00);
        cuentaBanco = new CuentaDeBanco("60035",1500.00);
        //ejemplo Overloading sobrecarga.
        cuentaBanco.actualizarDatos(19);
        cuentaBanco.actualizarDatos("Abisai");
        cuentaBanco.mostrarMonto();
        //ejemplo @Override sobre-escritura
        cuentaBanco.retiro(200.00);
        cuentaBanco.mostrarMonto();
        ahorroUno.retiro(200.00);
        ahorroUno.mostrarMonto();

    }
}
