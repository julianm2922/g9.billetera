package billete.ar;

public class Usuario {
    private String nombre;
    private int numeroTelefono;
    private ArrayList<Cuenta> cuentas;

    public Usuario(String nombre, int numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }
    
    public ArrayList<Cuenta> cuentas() {
    	return cuentas;
    }
}
