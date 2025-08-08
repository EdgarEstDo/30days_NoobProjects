package ejercicioTres;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		// Conjunto de variabales asociadas a la clase principal
		Utilidades utilsTres = new Utilidades();
		int valAleatorio = utilsTres.valorAleatorio();
		// int valSolicitado = utilsTres.valorSolicitado();

		// Código aplicado a la clase principal

		System.out.println(utilsTres.mensajeInicial());
		System.out.println("\n" + valAleatorio);
		int valSolicitado = utilsTres.valorSolicitado();

		// Bucle principal para verificar si el dato es correcto.
		for (int i = 1; (i < 5 && !utilsTres.esCorrecto(valSolicitado, valAleatorio)); i++) {

			if (!utilsTres.esCorrecto(valSolicitado, valAleatorio)) {

				System.out.println("\nEl valor introducido no coincide con el que se ha generado... Intente de nuevo.");
				valSolicitado = utilsTres.valorSolicitado();
			}
		}

		if (utilsTres.esCorrecto(valSolicitado, valAleatorio)) {

			System.out.printf("\n¡ENHORABUENA. Tu número %d coincide con el número generado: %d", valSolicitado,
					valAleatorio);

		} else {
			
			System.out.println("\nLo siento, no has conseguido adivinarlo. Gracias por jugar.");
		}

	}

	// Apartado de funciones que aplican a la parte principal

}
