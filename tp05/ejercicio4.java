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
public class ejercicio4
{
    public static void main ( String [ ] args )
         {
             int gotas;
             int tazas;
             System.out.println("Cuantas tazas se quieren preparar?");
             tazas = TecladoIn.readLineInt();
             gotas = tazas * 8;
             System.out.println("para " + tazas + " tazas sean preparadas");
             System.out.println("la cantidad de gotas necesarias son " + gotas);
         }   
}
