package org.example.moneda;

import javax.swing.*;

public class MenuConversorMonedas {
	public double ingresarCantidadPesos() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos a convertir:", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE);
		if (input != null) {
			try {
				double cantidadPesos = Double.parseDouble(input);
				return cantidadPesos;
			} catch (NumberFormatException e) {
				System.out.println("Error: Por favor, ingrese un número válido.");
			}
		}

		return 0.0; // Valor de retorno por defecto si no se ingresa una cantidad válida
	}

}
