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
public class ejercicio09 
{
    public static void main (String [ ] args)
         {
             /*Este algritmo determina si se ingresa un triangulo rectangulo*/
             double angulo1 , angulo2 , angulo3;
             boolean rectangulo;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el angulo 1");
             angulo1 = TecladoIn.readLineDouble();
             System.out.println("Ingrese el angulo 2");
             angulo2 = TecladoIn.readLineDouble();
             System.out.println("Ingrese el angulo 3");
             angulo3 = TecladoIn.readLineDouble();
             
             /*Procesamiento*/
             rectangulo = (((angulo1 + angulo2 + angulo3) == 180) && ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)));
             
             /*Salida*/
             System.out.println("Es un triangulo rectangulo: " + rectangulo);
         }
    
}
