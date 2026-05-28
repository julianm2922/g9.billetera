package billete.ar;

public class CuentaPremium extends Cuenta {
    private final double depositoInicialMinimo = 500000.00d;
    public CuentaPremium(String alias, Usuario propietario, double depositoInicial) {
        super(alias, propietario);
        validarDepositoInicial(depositoInicial);
        
        super.depositar(depositoInicial);
    }

    private void validarDepositoInicial() throws RuntimeException {
        if (depositoInicial < depositoInicialMinimo) {
            throw new RuntimeException("El tipo de cuenta requiere un depósito inicial de " + depositoInicialMinimo);
        }
    }
}
