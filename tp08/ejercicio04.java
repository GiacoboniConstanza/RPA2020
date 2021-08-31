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
public class ejercicio04 {
    public static void main(String[] args) {

        int tipoCalculo;
        double i, n;

        System.out.println("Ingrese el tipo de calculo que quiere realizar, 1: productoria o 2: sumatoria");
        tipoCalculo = TecladoIn.readLineInt();
        System.out.println("Ingrese a partir de que numero");
        i = TecladoIn.readLineDouble();
        System.out.println("Ingrese hasta que numero");
        n = TecladoIn.readLineDouble();

        switch (tipoCalculo) {
            case 1:
                System.out.println("El resultado es: " + productoria(i, n));
                break;
            case 2:
                System.out.println("El resultado es: " + sumatoria(i, n));
                break;
            default:
                System.out.println("Error");
        }
    }

    public static double productoria(double i, double n) {
        double resultado = 1;
        for (i = i; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    public static double sumatoria (double i, double n){
        double resultado = 0;
        for (i = i;  i <=n; i++){
            resultado = resultado + i;
        }
        return resultado;
    }
}
