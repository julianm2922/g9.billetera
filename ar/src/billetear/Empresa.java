package billete.ar;

public class Empresa extends Usuario {
    private String cuit;
    private String razonSocial;
    private String email;
    private ArrayList<String> dnisAutorizados;

    public Empresa(String razonSocial, int numeroTelefono, String cuit, String email, String nombreContacto) {
        super(nombreContacto, numeroTelefono);

        this.email = email;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public String cuit() {
        return cuit;
    }
}