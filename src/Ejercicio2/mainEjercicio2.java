package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {
	
    public static void main(String[] args) {
    	
    	ArrayList<IEdificio> listaEdificios = new ArrayList<IEdificio>();   
    	
    	try {
        	IEdificio poliRucaChe = new Polideportivo("Ruca che", 500, 1);
        	listaEdificios.add(poliRucaChe);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	try {
        	IEdificio poliSanMartin = new Polideportivo("San Martin", 800, 2);
        	listaEdificios.add(poliSanMartin);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	try {
        	IEdificio poliOlimpico = new Polideportivo("Olimpico", 1200, 3);
        	listaEdificios.add(poliOlimpico);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	try {
        	IEdificio coworkBPN = new EdificioOficinas(255, 15);
        	listaEdificios.add(coworkBPN);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
        	
    	try {
        	IEdificio edificioBuilding = new EdificioOficinas(1600, 40);
        	listaEdificios.add(edificioBuilding);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	//prueba de excepciones superficies negativas
    	try {
    	    IEdificio poliNegativo = new Polideportivo("Negativo", -500, 1);
    	    listaEdificios.add(poliNegativo);
    	} catch (ExcepcionValorInvalido e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	
    	Iterator<IEdificio> it = listaEdificios.iterator();
        while (it.hasNext()) {
            IEdificio e = it.next();
            System.out.println(e);
        }
        
        /** 
         * Funcionamiento .toString() a través de System.out.Println(e)
         * 
         *  El método println que está definido en PrintStream 
         *  (la clase de System.out) tiene una sobrecarga:
         *  
		 *	public void println(Object x) {
		 *		String s = String.valueOf(x);
	     *		print(s);
	     *		newLine();
    	 *  }
    	 *  
    	 *  Luego, String.valueOf(x) para objetos hace internamente:
    	 *  
		 *	return (x == null) ? "null" : x.toString();
         */
    }
}
