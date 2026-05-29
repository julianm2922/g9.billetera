package billete.ar;

public class CuentaRegular extends Cuenta {
	
    public CuentaRegular(String alias, Usuario propietario) {
		super(alias, propietario);
		// TODO Auto-generated constructor stub
	}

	private final double montoMaximo = 500000.00d;

    @Override
    public void depositar(double monto) {
        if (monto + super.saldoDisponible() > montoMaximo) {
            throw new RuntimeException("El monto a depositar excede el monto máximo asignado al tipo de cuenta.");
        }

        super.depositar(monto);
    }
}
