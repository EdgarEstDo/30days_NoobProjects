/**
 * Clase Utilidades enfocada en realizar las operaciones aritméticas
 * 
 * @author Edgar ED
 * 
 * Dispone de las 4 funciones que implementan las operaciones aritméticas
 * solicitadas en el ejercicio.
 * 
 * (Realizado sin haber visto el vídeo del tutorial)
 * 
 */

package github.dia.dos;

import java.util.Scanner;


public class Utilidades {

	//Atributos base: Solicitud de datos
	private Scanner sc = new Scanner(System.in);
	
	

	// Funciones - Basado en la aritmética
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return El valor resultante de la suma
	 */
	public double sumaValores(double val1, double val2) {

		return val1 + val2;
	}
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return El valor resultante de la resta
	 */
	public double restaValores(double val1, double val2) {

		return val1 - val2;
	}
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return El valor resultante de la multiplicación
	 */
	public double multiplicaValores(double val1, double val2) {

		return val1 * val2;
	}
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return El valor resultante de la división
	 */
	public double divideValores(double val1, double val2) {

		return val1 / val2;
	}
	
	
	public ValoresIniciales introduceValorOk() {
		
		//Variables creadas para la función
		double val1 = 0.0;
		double val2 = 0.0;
		boolean valOk = false;
		
		//Bucle continuado en caso de excepciones
		do {
			
			try {
					
					System.out.println("\nIntroduzca el dato 1: ");
					val1 = Double.parseDouble(sc.nextLine());
					
					System.out.println("\nIntroduzca el dato 2: ");
					val2 = Double.parseDouble(sc.nextLine());
					
					valOk = true;
					
				
				
			}catch (Exception e) {
				
				System.out.println("\nError de entrada del dato. Intente de nuevo... ");
				 
				
			}
			
		} while(valOk != true);
		
		return new ValoresIniciales(val1, val2);
	}	
}
