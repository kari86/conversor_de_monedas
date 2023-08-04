package org.example.longitud;

public class ConversorMedidas {
    public double centimetroMetro(double conversionDeMedida) {
        double medidametro = 100;
        double resultado = conversionDeMedida / medidametro;

        return resultado;

    }

    public double centimetroKilometro(double conversionDeMedida) {
        double medidakilometro = 100000;
        double resultado = conversionDeMedida / medidakilometro;

        return resultado;

    }

    public double centimetroPies(double conversionDeMedida) {
        double medidaPies = 30.48;
        double resultado = conversionDeMedida / medidaPies;

        return resultado;
    }

    public double centimetroPulgadas(double conversionDeMedida) {
        double medidaPulgadas = 2.54;
        double resultado = conversionDeMedida / medidaPulgadas;

        return resultado;
    }

        public double centimetroMilimetro(double conversionDeMedida){
            double medidaMilimetro = 0.10;
            double resultado = conversionDeMedida / medidaMilimetro;

            return resultado;
    }

    public double metroCentimetro(double conversionDeMedida){
        double medidaCentimetro = 0.01;
        double resultado = conversionDeMedida / medidaCentimetro;

        return resultado;
    }
    public double kilometroCentimetro(double conversionDeMedida){
        double medidaCentimetro = 0.00001;
        double resultado = conversionDeMedida / medidaCentimetro;

        return resultado;
    }
    public double piesCentimetro(double conversionDeMedida){
        double medidaCentimetro = 0.0328084;
        double resultado = conversionDeMedida / medidaCentimetro;

        return resultado;
    }

    public double pulgadasCentimetro(double conversionDeMedida){
        double medidaCentimetro = 0.393701;
        double resultado = conversionDeMedida / medidaCentimetro;

        return resultado;
    }

    public double milimetrosCentimetro(double conversionDeMedida){
        double medidaCentimetro = 10;
        double resultado = conversionDeMedida / medidaCentimetro;

        return resultado;
    }
}