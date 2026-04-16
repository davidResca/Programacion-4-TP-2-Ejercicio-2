package Ejercicio2;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {
	private String nombre;
	private double superficie;
	private int tipoInstalacion;
	
	
	//Constructores
	public Polideportivo() {
		
	}
	
    public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
    	//Agregar nuevo metodo
    	this.nombre=nombre;
    	this.superficie=superficie;
    	this.tipoInstalacion=tipoInstalacion;
		
	}

	@Override
	public int getTipoInstalacion() {
		return tipoInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		
		return superficie;
	}
    
    
	@Override
	public String toString() {
		return "Polideportivo -> Nombre: " + nombre + " | Superficie: " + superficie + " m2 | Tipo de Instalación: " + tipoInstalacion;
	}
	
}
