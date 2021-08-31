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
public class ejercicio5 
{
    public static void main ( String [ ] args)
       {
           //Este algoritmo convierte una medida en cm, ingresada por el usuario, y la convierte en metros, milimetros y pulgadas
           double centimetros, pulgadas, metros, milimetros;
          
           //Ingreso de datos
           System.out.println("Ingrese la medida en centimetros a convertir en metros, milimetros y pulgadas");
           centimetros = TecladoIn.readLineDouble();
           
           //Procesamiento
           metros = centimetros / 100.0;
           milimetros = centimetros * 10.0;
           pulgadas = centimetros * 0.3937;
           
           //Salida
           System.out.println("El equivalente en metros es: " + metros);
           System.out.println("El equivalente en milimetros es: " + milimetros);
           System.out.println("El equivalente en pulgadas es: " + pulgadas);
       }     
}
