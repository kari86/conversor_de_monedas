package org.example.longitud;

import javax.swing.*;

public class MenuConversorMedidas {
    public double ingresarMedidaAConvertir() {
        String input = JOptionPane.showInputDialog(null, "Ingrese la Medida a convertir:", "Conversor de Medida", JOptionPane.QUESTION_MESSAGE);
        if (input != null) {
            try {
                double medida= Double.parseDouble(input);
                return medida;
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
            }
        }

        return 0.0; // Valor de retorno por defecto si no se ingresa una cantidad válida
    }

}
