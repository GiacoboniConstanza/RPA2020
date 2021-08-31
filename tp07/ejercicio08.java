/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio08 {

    public static void main(String[] args) {
        //Este algoritmo evalua el plan de pago elegido, determina de cuanto es el descuento en cada caso y cual es el monto final a pagar
        double montoMensual, descuento = 0, montoFinal;
        char plan;

        //Ingreso de datos
        System.out.println("Ingrese el monto mensual");
        montoMensual = TecladoIn.readLineDouble();
        System.out.println("Ingrese el plan elegido: A, B, C");
        plan = TecladoIn.readLineNonwhiteChar();

        //Procesamiento
        switch (plan) {
            case 'A':
                System.out.println("Tiene un 25% de descuento");
                descuento = montoMensual * 25 / 100;

                break;
            case 'B':
                System.out.println("Tiene un 10% de descuento");
                descuento = montoMensual * 10 / 100;

                break;
            case 'C':
                System.out.println("No tiene descuento");
                descuento = 0;

                break;
            default:
                System.out.println("Ingreso un plan incorrecto");
                break;

        }
        //Salida
        montoFinal = montoMensual - descuento;
        System.out.println("Descuento: " + descuento);
        System.out.println("Monto final a pagar: " + montoFinal);
    }

}
