package github.dia.dos;

public class ValoresIniciales {
	
	//atributos necesarios para la clase
	private double val1;
	private double val2;
	
	//CONSTRUCTORES
	
	//Creamos el constructor aplicado al ejercicio.
	public ValoresIniciales(double val1, double val2) {
		
		this.val1 = val1;
		this.val2 = val2;
	}
	
	/**
	 * 
	 * @param val2
	 */
	public ValoresIniciales(double val2) {
		
		this.val2 = val2;
	}
	
	//GETTERS y SETTERS
	
	/**
	 * 
	 * @return el valor introducido en val1
	 */
	public double getVal1() {
		return val1;
	}
	/**
	 * 
	 * @param val1
	 */
	public void setVal1(double val1) {
		this.val1 = val1;
	}
	/**
	 * 
	 * @return el valor introducido en val2
	 */
	public double getVal2() {
		return val2;
	}
	/**
	 * 
	 * @param val2
	 */
	public void setVal2(double val2) {
		this.val2 = val2;
	}
	
	

}
