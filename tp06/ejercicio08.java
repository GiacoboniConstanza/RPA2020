/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio08 
{
    public static void main (String [ ] args)
         {
             /*Este algoritmo evalua si es lunes o jueves y si son las 07.00 hay que levantarse*/
             char dia;
             double hora;
             boolean levantarse;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el dia");
             dia = TecladoIn.readLineNonwhiteChar();
             System.out.println("Ingrese la hora");
             hora = TecladoIn.readLineDouble();
             
             /*Procesamiento*/
             levantarse = (dia == 'l' && hora >= 07.00) || (dia == 'j' && hora >= 07.00);
             
             /*Salida*/
             System.out.println("Tendrias que levantarte: " + levantarse);
         }
    
}
