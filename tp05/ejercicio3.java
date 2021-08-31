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
public class ejercicio3 
{
public static void main ( String [ ] args)    
       { 
           int porciones;
                     
           System.out.println("Cuantas porciones se quieren preparar?");
           porciones = TecladoIn.readLineInt();
           
           double agua;
           double caldo;
           double polenta;
           double tiempo;
           
           agua = (porciones * 3) / 4.0;
           caldo = (porciones * 2) / 4.0;
           polenta = (porciones * 1) / 4.0;
           tiempo = 1;
                   
           System.out.println("Para preparar " + porciones + " porciones de polenta");
           System.out.println("En una olla se lleva a hervor " + agua + " tazas de agua");
           System.out.println("Se disuelve " + caldo + " cubitos de caldo");
           System.out.println("Agregar " + polenta + " tazas de polenta");
           System.out.println("Revolver constantemente durante " + tiempo + " minuto");
       } 
}
