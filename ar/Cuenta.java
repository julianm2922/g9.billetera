package billete.ar;

public class Cuenta {
    private String cvu;
    private String alias;
    private double montoEnInversiones;
    
    protected double saldo;
    protected Usuario propietario;

    public Cuenta(String alias, Usuario propietario) {
        validarAlias(alias);

        this.alias = alias;
        this.propietario = propietario;
    }

    public String cvu() { 
        return cvu; 
    }
    
    public String alias() { 
        return alias; 
    }

    public Usuario propietario() { 
        return propietario;
    }

    public double saldoDisponible() { 
        return saldo; 
    }

    public void extraer(double monto) throws RuntimeException {
        if (monto > saldo) {
            throw new RuntimeException("No hay fondos suficientes en la cuenta para realizar la extracción.");
        } 

        saldo -= monto;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double dineroInvertido() {
        return montoEnInversiones;
    }
    
    /*
    public void agregarInversion();
    */

    public __toString() {
        return new StringBuilder(this.getClass())
            .append(" (cvu: \"")
            .append(cvu)
            .append("\"; alias: \"")
            .append(alias)
            .append("\"; saldo: \"")
            .append(saldo)
            .append("\"; montoEnInversiones: \"")
            .append(montoEnInversiones)
            .append("\"; propietario: \"")
            .append(propietario.nombre());
    }
    
    /** PRIVADOS */
    private validar(String alias) throws RuntimeException {
        if (!(
            alias != null && 
            alias.matches("^[a-z0-9.]+$") && 
            alias.length >= 5 && 
            alias.length <= 20
        )) {
            throw new RuntimeException("Alias inválido.");
        }
    }


}
