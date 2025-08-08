package ejercicioTres;

import java.util.Random;
import java.util.Scanner;

public class Utilidades {

	// Atributos base: Solicitud de datos
	private Scanner sc = new Scanner(System.in); // Creado para realizar introducción de teclado
	private Random random = new Random(); // Creado para realizar interacciones con la librería de Random.
	// private boolean valOk = false; // Creado para generar bucles de confirmación

	// Funciones principales dentro de las utilidades

	/**
	 * Función mensaje inicial
	 * 
	 * @return el mensaje inicial que se ha propuesto para el inicio.
	 */
	public String mensajeInicial() {

		return "Bienvenido al campeonato contra la máquina para adivinar números aleatorios.\n\nDispones de 5 intentos, ¡No los desperdicies! \n";

	}

	/**
	 * Función para generar valores aleatorios entre 1 y 10
	 * 
	 * @return El valor aleatorio generado con la librería Random
	 */
	public Integer valorAleatorio() {

		return random.nextInt(10);
	}

	/**
	 * Función creada para realizar la solicitud del valor con manejo de excepciones
	 * aplicado a valores enteros
	 * 
	 * @return el valor que se solicita con el manejo de excepciones ya realizado.
	 */
	public Integer valorSolicitado() {

		boolean valOk = false; // Al inicio de cada uso de la función, se resetea el valor de valOk para poder
								// repetir su uso
		int valor = 0;

		do {
			try {

				System.out.print("\nIntroduzca el número que crees que se ha generado: ");
				valor = Integer.parseInt(sc.nextLine());
				valOk = true;

			} catch (Exception e) {

				System.out.println("\nError en la introducción del dato: " + e.getMessage() + "\n");

			}

		} while (!valOk);

		return valor;
	}

	/**
	 * Función creada para realizar la comparativa de los dos valores que forman
	 * parte del ejercicio
	 * 
	 * @param valorPedido es el valor que introducimos manualmente
	 * @param valorRandom es el valor que se genera aleatoriamente
	 * @return true o false en base a la comparación que se realiza
	 */
	public boolean esCorrecto(int valorPedido, int valorRandom) {

		return valorPedido == valorRandom; // En una sola línea generamos la comparación sin tener que crear IFs ni dar
											// valores a otras variables.
	}
	


}
