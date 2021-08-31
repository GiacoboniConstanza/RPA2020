/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp08;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio05 {

    public static void main(String[] args) {

        double x1, y1, x2, y2, perimetro = 0;
        int varIter;

        for (varIter = 1; varIter < 4; varIter++) {
            System.out.println("Ingrese las coordenadas del lado: " + varIter);
            x1 = TecladoIn.readLineDouble();
            y1 = TecladoIn.readLineDouble();
            x2 = TecladoIn.readLineDouble();
            y2 = TecladoIn.readLineDouble();
            perimetro = perimetro + calcularDistanciaPuntos(x1, y1, x2, y2);
        }
        System.out.println("El perimetro es: " + perimetro);

    }

    public static double calcularDistanciaPuntos(double x1, double y1, double x2, double y2) {
        double d;
        d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        d = Math.sqrt(d);
        return d;
    }

}
