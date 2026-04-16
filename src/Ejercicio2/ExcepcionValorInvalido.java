package Ejercicio2;

public class ExcepcionValorInvalido extends RuntimeException{

	public ExcepcionValorInvalido() {
		super("Error: Se ingreso un valor numerico invalido");
	}
	
	public ExcepcionValorInvalido(String mensaje) {
		super(mensaje);
	}
}
