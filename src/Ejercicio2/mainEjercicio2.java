package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {
	
    public static void main(String[] args) {
    	
    	ArrayList<IEdificio> listaEdificios = new ArrayList<IEdificio>();   
    	
    	IEdificio poliRucaChe = new Polideportivo("Ruca che", 500, 1);
    	IEdificio coworkBPN = new EdificioOficinas(255, 15);
    	IEdificio edificioBuilding = new EdificioOficinas(1600, 40);

    	
    	listaEdificios.add(poliRucaChe);
    	listaEdificios.add(coworkBPN);
    	listaEdificios.add(edificioBuilding);
    	
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
