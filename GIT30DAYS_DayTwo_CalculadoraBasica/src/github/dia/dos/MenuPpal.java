package github.dia.dos;

//Imports de librerías necesarias para el uso de la aplicación
import java.util.Scanner;

public class MenuPpal {

	// Atributos para la clase

	Scanner sc = new Scanner(System.in);
	Utilidades aritUtils = new Utilidades();
	double val1 = 0.0, val2 = 0.0, valTotal = 0.0;
	boolean valOk = false;
	ValoresIniciales valores;

	/**
	 * 
	 * @param nombre es la String que nosotros asociamos al título
	 * @return retorna la String que añadimos al principio como parámetro con
	 *         formato.
	 */
	public String titulo(String nombre) {

		return "-".repeat(10) + nombre + "-".repeat(10);
	}

	/**
	 * Función preparada para que aparezca el menú en el bucle infinito.
	 * 
	 * @return el título de la calculadora con la impresión del código.
	 */
	public String tituloMenu() {

		return titulo(" CALCULADORA BÁSICA ") + "\n\n1.Suma" + "\n2.Resta" + "\n3.Multiplicación" + "\n4.División"
				+ "\n0.Salir";
	}

	/**
	 * Función del Switch creada para contener las opciones del menú creado.
	 * 
	 * Dentro de este menú estan todas las operaciones aritméticas que hemos creado
	 * previamente para poder tener modularidad y divisón de clases por si hubiera
	 * que modificar algo.
	 * 
	 */
	public void menuFunciones() {

		do {

			try {
				System.out.println(tituloMenu());
				System.out.println("\nSeleccione una opción: ");
				int opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {

				case 1: {
					System.out.println(titulo(" MENU 1: SUMA "));
					valores = aritUtils.introduceValorOk();
					valTotal = aritUtils.sumaValores(valores.getVal1(), valores.getVal2());
					System.out.println("\nEl resultado de la suma es: " + valTotal);

					break;
				}
				case 2: {
					System.out.println(titulo(" MENU 2: RESTA "));
					valores = aritUtils.introduceValorOk();
					valTotal = aritUtils.restaValores(valores.getVal1(), valores.getVal2());
					System.out.println("\nEl resultado de la resta es: " + valTotal);
					break;
				}
				case 3: {
					System.out.println(titulo(" MENU 3: MULTIPLICA "));
					valores = aritUtils.introduceValorOk();
					valTotal = aritUtils.multiplicaValores(valores.getVal1(), valores.getVal2());
					System.out.println("\nEl resultado de la multiplicación es: " + valTotal);

					break;
				}
				case 4: {
					System.out.println(titulo(" MENU 4: DIVIDE "));

					do {
						valores = aritUtils.introduceValorOk();
						if(valores.getVal2() == 0) {
							System.out.println("\n Dato 2 no puede ser cero, introduzca los datos de nuevo...\n");
						}
					} while (valores.getVal2() == 0);
					valTotal = aritUtils.divideValores(valores.getVal1(), valores.getVal2());
					System.out.println("\nEl resultado de la división es: " + valTotal);

					break;
				}
				case 0: {

					System.out.println(titulo(" FIN DEL PROGRAMA "));
					valOk = true;

					break;
				}

				}

			} catch (Exception e) {
				System.out.println("\n\nEl dato introducido es incorrecto. Intente de nuevo...\n");
			}

		} while (valOk != true);

	}

}
