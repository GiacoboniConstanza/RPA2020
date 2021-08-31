/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class practica1 
{
    public static void main (String [ ] args)
       {
        //Este algoritmo determina si una persona puede comprar combustible y en caso de ser posible calcula el monto a cobrar
        char autVigente, tipoTrabajo, tipoComb;
        double cantLitros, montoCobrar;

        //Ingreso de datos
        System.out.println("Por favor ingrese la situación de su autorización: V: vigente - S: suspendida - T: trámite");
        autVigente = TecladoIn.readLineNonwhiteChar();
        System.out.println("Por favor ingrese su tipo de trabajo: P: salud - M: cuidado de personas mayores - S: servicios esenciales");
        tipoTrabajo = TecladoIn.readLineNonwhiteChar();

        //Procesamiento
        autVigente = Character.toUpperCase(autVigente);
        tipoTrabajo = Character.toUpperCase(tipoTrabajo);

        if ((tipoTrabajo == 'P' || tipoTrabajo == 'M' || tipoTrabajo == 'S') && (autVigente == 'V')) {
            System.out.println("Por favor ingrese el tipo de combustible: S: super - Cualquier otro para premium");
            tipoComb = TecladoIn.readLineNonwhiteChar();
            System.out.println("Ingrese la cantidad de litros");
            cantLitros = TecladoIn.readLineDouble();

            tipoComb = Character.toUpperCase(tipoComb);

            if (tipoComb == 'S') {
                montoCobrar = cantLitros * 42.01;
            } else {
                montoCobrar = cantLitros * 48.59;
            }

            System.out.println("El monto a pagar es de $" + montoCobrar);
        } else {
            System.out.println("No puede comprar combustible");
        }
    }

}
