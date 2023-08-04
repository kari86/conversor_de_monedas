package org.example.menu;

import javax.swing.*;
import java.util.Arrays;

/**
 * Utilizamos JOptionPane, favor de leer documentacion
 */
public class Menu {
	/**
	 * Metodo de incio donde permite seleccionar "Iniciar" o "Salir"
	 *
	 * @return retorna 1 cuando se selecciona Iniciar
	 * retorna 0 cuando se selecciona salir
	 */
	public int mostrarMenu() {
		int opcion = JOptionPane.showOptionDialog(null,
				"Hola, bienvenido a conversor\n     Elige una opción:", "Menú",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Iniciar", "Salir"}, "Iniciar");

		if (opcion == JOptionPane.YES_OPTION) {
			return 1;
		} else {
			return 0;
		}
	}


	/**
	 * Metodo donde permite seleccionar el tipo de conversor a utilizar
	 *
	 * @return retorna 1 cuando se selecciona "Moneda"
	 * retorna 0 cuando se selecciona "Medidas"
	 * retorna -1 cuando se da clic en cancelar
	 */
	public int seleccionarConversor() {
		Object[] opciones = {"Moneda", "Medidas"};
		String seleccion = (String) JOptionPane.showInputDialog(null,
				"Seleccione un conversor:", "Lista de opciones",
				JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		if (seleccion != null) {
			if (seleccion.equals("Moneda")) {
				System.out.println("Opción seleccionada: Moneda");
				return 1;
			} else if (seleccion.equals("Medidas")) {
				System.out.println("Opción seleccionada: Medidas");
				return 0;
			}
		}
		return -1; // Valor de retorno por defecto si no se selecciona ninguna opción válida
	}

	public int mostrarConversorMonedas() {
		String[] opciones = {
				"Peso a Dólar", "Peso a Euro", "Peso a Libras Esterlinas",
				"Peso a Yen Japonés", "Peso a Won Surcoreano", "Dólar a Peso",
				"Euro a Peso", "Libras Esterlinas a Peso", "Yen Japonés a Peso", "Won Surcoreano a Peso"
		};
		String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Lista de monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		if (seleccion != null) {
			int indiceSeleccionado = 1 + Arrays.asList(opciones).indexOf(seleccion);
			System.out.println("Opción seleccionada: " + seleccion);
			return indiceSeleccionado;
		}

		return -1; // Valor de retorno por defecto si no se selecciona ninguna opción válida
	}



	////Aqui va el menu de medidas con el ombre de mostrarConversorMed


	public int mostrarConversorDeMedidas() {
		String[] opciones = {
				"centimetro a metro", "centimetro a kilometro", "centimetro a pies",
				"centimetro a pulgada", "centimetro a milimetro", "metro a centimetro",
				"kilometro a centimetro", "pies a centimetros", "pulgadas a centimetro", "milimetro a centimetro"
		};
		String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Lista de monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		if (seleccion != null) {
			int indiceSeleccionado = 1 + Arrays.asList(opciones).indexOf(seleccion);
			System.out.println("Opción seleccionada: " + seleccion);
			return indiceSeleccionado;
		}

		return -1; // Valor de retorno por defecto si no se selecciona ninguna opción válida
	}

}