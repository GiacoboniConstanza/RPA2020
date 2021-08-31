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
public class ejercicio05 
{
     public static void main (String [ ] args)
         {
             /*Este algoritmo invierte las cifras del numero ingresado*/
             int numIngresado , divisor , numInvertido;
             boolean capicua ;
             /*Ingreso de datos*/
             System.out.println("Ingrese un valor de 3 cifras");
             numIngresado = TecladoIn.readLineInt();
             
             /*Procesamiento*/
             numInvertido = (((numInvertido = numIngresado % (divisor = 10))*100 + (numIngresado / (divisor * 10)))) + (((numIngresado / divisor)%divisor)*10);
             capicua = numIngresado == numInvertido;
             /*Salida*/
             System.out.println(numInvertido);
             System.out.println("Es capicua: " + capicua);
         }
    
}
