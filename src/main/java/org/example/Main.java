package org.example;

import org.example.longitud.ConversorMedidas;
import org.example.longitud.MenuConversorMedidas;
import org.example.menu.Menu;
import org.example.moneda.ConversorMonedas;
import org.example.moneda.MenuConversorMonedas;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {

		//Declaracion de variables a utilizar
		int opcionInicio = 1;
		int seleccionConversor;
		int selecccionTipoMoneda = 0;
		int seleccionTipoMedida = 0;

		//Instanciamos objeto menu de la clase Menu
		Menu menu = new Menu();

		// Se lanza por primera ves el menuInicio
		opcionInicio = menu.mostrarMenu();

		while (opcionInicio == 1) {
			seleccionConversor = menu.seleccionarConversor();
			if (seleccionConversor == 1) {
				//Se lanza Conversor de moneda

				selecccionTipoMoneda = menu.mostrarConversorMonedas();
				System.out.println("El numero de seleccion moneda es: " + selecccionTipoMoneda);


				//Creamos objeto de MenuConversorModenas con nombre menuConversorMonedas
				MenuConversorMonedas menuConversorMonedas = new MenuConversorMonedas();

				//Creamos objeto de ConversorModenas con nombre conversorModedas
				ConversorMonedas conversorMonedas = new ConversorMonedas();

				double cantidadAConvertir;
				double resultadoConversion;
				String mensaje;
				switch (selecccionTipoMoneda) {
					case 1:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.pesoDolar(cantidadAConvertir);

						//Salida en pantalla
						mensaje = cantidadAConvertir + " pesos mexicanos son " + resultadoConversion + " dólares";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

						break;
					case 2:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.pesoEuro(cantidadAConvertir);
						mensaje = cantidadAConvertir + " pesos mexicanos son " + resultadoConversion + " euros";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

						break;
					case 3:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.pesoLibrasEsterlinas(cantidadAConvertir);
						mensaje = cantidadAConvertir + " pesos mexicanos son " + resultadoConversion + "Libras";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 4:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.pesoYenJapones(cantidadAConvertir);
						mensaje = cantidadAConvertir + " pesos mexicanos son " + resultadoConversion + " Yen japones";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 5:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.pesoWonSurcoreano(cantidadAConvertir);
						mensaje = cantidadAConvertir + " pesos mexicanos son " + resultadoConversion + " WonSurcoreano";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 6:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.Dolarpeso(cantidadAConvertir);
						mensaje = cantidadAConvertir + " Dolares son " + resultadoConversion + " pesos";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 7:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.EuroPeso(cantidadAConvertir);
						mensaje = cantidadAConvertir + " Euros son " + resultadoConversion + " Pesos";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 8:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.LibrasEsterlinasPeso(cantidadAConvertir);
						mensaje = cantidadAConvertir + " libras esterlinas son " + resultadoConversion + " pesos";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 9:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.YenJaponespeso(cantidadAConvertir);
						mensaje = cantidadAConvertir + " yens son " + resultadoConversion + " Pesos";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 10:
						cantidadAConvertir = menuConversorMonedas.ingresarCantidadPesos();
						resultadoConversion = conversorMonedas.WonSurcoreanopeso(cantidadAConvertir);
						mensaje = cantidadAConvertir + " Won " + resultadoConversion + " pesos";
						JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						// Código para el caso por defecto (si el valor no es ninguno de los anteriores)
						break;
				}

			} else {
				//Se lanza el conversor de medidas
			}
				if (seleccionConversor == 0) {
					seleccionTipoMedida = menu.mostrarConversorDeMedidas();
					System.out.println("El numero de seleccion medida es: " + seleccionTipoMedida);


					//Creamos objeto de MnuConversorMedidas con nombre menuConversorMedidas
					MenuConversorMedidas menuConversorMedidas = new MenuConversorMedidas();

					//Creamos objeto de ConversorMedidas con nombre conversorMedidas
					ConversorMedidas conversorMedidas = new ConversorMedidas();

					double medidaAConvertir;
					double resultadoConversion;
					String mensaje;
					switch (seleccionTipoMedida) {
						case 1:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.centimetroMetro(medidaAConvertir);

							//Salida en pantalla
							mensaje = medidaAConvertir + " centimetros son " + resultadoConversion + " metros";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

							break;
						case 2:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.centimetroKilometro(medidaAConvertir);
							mensaje = medidaAConvertir + " centimetros son " + resultadoConversion + " kilometros";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

							break;
						case 3:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.centimetroPies(medidaAConvertir);
							mensaje = medidaAConvertir + " centimetros son " + resultadoConversion + " pies ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

							break;

						case 4:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.centimetroPulgadas(medidaAConvertir);
							mensaje = medidaAConvertir + " centimetros son " + resultadoConversion + " pulgadas ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

							break;
						case 5:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.centimetroMilimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " centimetros son " + resultadoConversion + " milimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);

							break;

						case 6:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.metroCentimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " metros  son " + resultadoConversion + " centimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
							break;

						case 7:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.kilometroCentimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " Kilometros  son " + resultadoConversion + " centimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
							break;

						case 8:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.piesCentimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " pies  son " + resultadoConversion + " centimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
							break;


						case 9:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.pulgadasCentimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " ulgadas son " + resultadoConversion + " centimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
							break;


						case 10:
							medidaAConvertir = menuConversorMedidas.ingresarMedidaAConvertir();
							resultadoConversion = conversorMedidas.milimetrosCentimetro(medidaAConvertir);
							mensaje = medidaAConvertir + " milimetros son " + resultadoConversion + " centimetros ";
							JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
							break;
					}
				}
		}
	}
}
