package Ejercicio2;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {
	private String nombre;
	private double superficie;
	private int tipoInstalacion;
	
	
	//Consatructores
	public Polideportivo() {
		
	}
	
    public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
    	
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
    
    

	
    

}
