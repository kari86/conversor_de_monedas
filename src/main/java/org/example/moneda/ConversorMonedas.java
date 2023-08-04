package org.example.moneda;

public class ConversorMonedas {
	public double pesoDolar(double cantidadPesos){
		double valorDolar = 16.75;
		double resultado = cantidadPesos / valorDolar;

		//	se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;

	}

	public double pesoEuro(double cantidadPesos){
		double valorEuro = 18.81;
		double resultado = cantidadPesos / valorEuro;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double pesoLibrasEsterlinas(double cantidadPesos){
		double valorLibras = 21.61;
		double resultado = cantidadPesos / valorLibras;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double pesoYenJapones(double cantidadPesos){
		double valorYenJapones = 0.12;
		double resultado = cantidadPesos / valorYenJapones;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double pesoWonSurcoreano(double cantidadPesos){
		double valorWonSurcoreano = 76.59;
		double resultado = cantidadPesos / valorWonSurcoreano;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}
	public double Dolarpeso(double cantidadDolares){
		double valorPesos = 0.059;
		double resultado = cantidadDolares / valorPesos;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double EuroPeso(double cantidadEuros){
		double valorpeso = 0.054;
		double resultado = cantidadEuros / valorpeso;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double LibrasEsterlinasPeso(double cantidadLibras){
		double valorPeso = 0.046;
		double resultado = cantidadLibras / valorPeso;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double YenJaponespeso(double cantidadYens){
		double valorPesos = 0.12;
		double resultado = cantidadYens / valorPesos;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}

	public double WonSurcoreanopeso(double cantidadWon){
		double valorPesos = 76.65;
		double resultado = cantidadWon / valorPesos;

		//se truncan valores a dos decimales
		resultado = Math.round(resultado * 100.0) / 100.0;

		return resultado;
	}
}