package billete.ar;

public class CuentaRegular extends Cuenta {
    private final double montoMaximo = 500000.00d;

    @Override
    public void depositar(double monto) {
        if (monto + super.saldoDisponible() > montoMaximo) {
            throw new RuntimeException("El monto a depositar excede el monto máximo asignado al tipo de cuenta.");
        }

        super.depositar(monto);
    }
}
