package billete.ar;

public class Empresa extends Usuario {
    private String cuit;

    public Persona(String nombre, int numeroTelefono, String cuit) {
        super(nombre, numeroTelefono);

        this.cuit = cuit;
    }

    public String cuit() {
        return cuit;
    }
}