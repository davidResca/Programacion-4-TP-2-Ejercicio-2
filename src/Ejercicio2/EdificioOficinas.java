package Ejercicio2;

public class EdificioOficinas implements IEdificio {
	private int numeroOficinas;
    private double superficie;
	
    
    public EdificioOficinas(double superficie, int numeroOficinas) {
        if (superficie < 0) {
            throw new ExcepcionValorInvalido("La superficie no puede ser negativa");
        }
        if (numeroOficinas < 0) {
            throw new ExcepcionValorInvalido("El numero de oficinas no puede ser negativo");
        }
    	//Agregar el nuevo metodo.
        this.superficie = superficie;
        this.numeroOficinas = numeroOficinas;
    }
    
   
 
    @Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	@Override
	public String toString() {
		return "Edificio de Oficinas -> Superficie: " + superficie + " m2 | Cantidad de Oficinas: " + numeroOficinas;
	}
	

}
