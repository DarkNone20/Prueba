package Principal;

import java.util.Scanner;

import Principal.inplementaciones.Dividir;
import Principal.inplementaciones.Multiplicar;
import Principal.inplementaciones.Restar;
import Principal.inplementaciones.Sumar;



public class Menu {
	
	Scanner   dato = new Scanner(System.in);

	
	public void MostrarMenu() {
		
		System.out.println(" Digite el numero uno :\t");
		double numUno = dato.nextDouble() ;
		
		System.out.println(" Digite el numero dos :\t");
		double numDos = dato.nextDouble() ;
		
	
		System.out.println(" Que operacion deseas hacer :\t");
		int seleccion = dato.nextInt() ;
		
	
	
		
		
		
		switch (seleccion) {
		case 1: {
			
			Sumar sm = new Sumar();
			System.out.println(sm.Sumar(numUno, numDos));
			
			
			
			break;
		}
		
       case 2: {
			
			Restar rs  = new Restar() ;
			
			System.out.println(rs.Restar(numUno, numDos));
			
			
			break;
		}
       case 3: {
			 ;
			 Multiplicar mul = new Multiplicar() ;
			 System.out.println(mul.Mutiplicar(numUno, numDos));
			
			break;
			
		}
       case 4: {
    	   Dividir div = new Dividir()   ;
    	   System.out.println(div.Divir(numUno, numDos));
			
			
			break;
			
		}
       
		default:
			throw new IllegalArgumentException("Unexpected value: " + seleccion);
		}
		
		
		
		
	}
	
	
	
	
}
