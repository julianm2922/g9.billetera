package billetear;
import java.time.LocalDate; 

public class Actividad {
	private static int idActividad;
	private LocalDate fecha;
	private String origen;
	private String monto;
	private boolean estaAprobado;
	
	public Actividad (int idActividad, LocalDate fecha, String origen, boolean estaAprobado) {
		this.idActividad = idActividad;
		this.fecha = fecha;
		this.origen = origen;
		this.estaAprobado = estaAprobado;
	}
	
	
	public int getIdActividad() {
		
		return idActividad;

	}
	
	public int getFecha() {

		return fecha;
		
		}
	
	public int getFecha() {

		return fecha;
		
		}
	
	public int getOrigen() {

		return origen;
		
		}
	
	public int getEstaAprobado() {

		return estaAprobado;
		
		}
	
}