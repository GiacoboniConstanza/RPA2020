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
public class ejercicio07 
{
    public static void main (String [ ] args)
         {
             /*Este algoritmo evalua si la letra ingresada ess vocal*/
             char letra;
             boolean vocal;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese una letra");
             letra = TecladoIn.readLineNonwhiteChar();
             
             /*Procesmiento*/
             if (vocal = (letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u'))
                 System.out.println("Se ha ingresado una vocal");
             else
                 System.out.println("No se ha ingresado una vocal");

         }
    
}
