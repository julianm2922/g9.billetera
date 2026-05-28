package billete.ar;

public class CuentaCorporativa extends Cuenta {
    private String cuit;

    public CuentaCorporativa(String alias, Usuario propietario, String cuit) {
        super(alias, propietario);

        this.cuit = cuit;
    }

    @Override
    public void extraer(double monto) {
        verificarAcceso();
        super.extraer(monto);
    }

    @Override
    public void depositar(double monto) {
        verificarAcceso();
        super.depositar(monto);
    }

    private void verificarAcceso() throws RuntimeException {
        if (!(
            super.propietario().estaAutorizadoCuit() && 
            super.propietario().cuitAutorizado() == cuit
        )) {
            throw new RuntimeException("El usuario no está autorizado para operar en esta cuenta.")
        }
    }
}
