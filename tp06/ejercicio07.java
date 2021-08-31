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
             vocal = (letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u');
             
             /*Salida*/
             System.out.println("Se ha ingresado una vocal: " + vocal);
         }
    
}
