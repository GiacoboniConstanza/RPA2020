/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio6 
{
    public static void main ( String [ ] args)
            {
                double x1;
                double y1;
                double x2;
                double y2;
                double puntoA;
                double puntoB;
                double distancia;
                
                System.out.println("Introduzca las coordenadas del punto A");
                x1 = TecladoIn.readLineDouble();
                y1 = TecladoIn.readLineDouble();
                
                System.out.println("Introduzca las coordenadas del punto B");
                x2 = TecladoIn.readLineDouble();
                y2 = TecladoIn.readLineDouble();
                
                puntoA = x1 - x2;
                puntoA = Math.pow(puntoA , 2);
                
                puntoB = y1 - y2;
                puntoB = Math.pow (puntoB , 2);
                
                distancia = puntoA + puntoB;
                distancia = Math.pow (distancia , 0.5);
                
                System.out.println("La distancia desde el punto A al punto B es " + distancia);
            }
   
}
