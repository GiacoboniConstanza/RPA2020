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
public class ejercicio06 
{
    public static void main (String [ ] args)
         {
             
/*Este algoritmo determina si el primer numero ingresado es mayor, menor o intermedio de los 3*/
            int num1 , num2 , num3;
            boolean mayor , menor , intermedio;

            /*Ingreso de datos*/
            System.out.println("Ingrese un valor numérico para el Número 1");
            num1 = TecladoIn.readLineInt();
            System.out.println("Ingrese un valor numérico para el Número 2 - diferente al anterior");
            num2 = TecladoIn.readLineInt();
            System.out.println("Ingrese un valor numérico para el Número 3 - diferente los anteriores");
            num3 = TecladoIn.readLineInt();

            /*Procesamiento*/
            mayor = (num1 > num2) && (num1 > num3);
            menor = (num1 < num2) && (num1 < num3);
            intermedio = ((num1 < num2) && (num1 > num3) || (num1 > num2) && (num1 < num3));

            /*Salida*/
            System.out.println("El numero 1 es mayor: " + mayor);
            System.out.println("El numero 1 es menor: " + menor);
            System.out.println("El numero 1 es intermedio: " + intermedio);
         }
    
}
