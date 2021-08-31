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
public class ejercicio11 
{
    public static void main (String [ ] args)
         {
        /*este algoritmo resta y suma una unidad para ver si los 3 numeros ingresados llegan a ser iguales*/

        int num1, num2, num3;
        boolean igualdadNum1Num2, igualdadNum2Num3, igualdadDeLos3;

        /*Ingreso de datos*/
        System.out.println("Ingrese un valor numérico para el Número 1");
        num1 = TecladoIn.readLineInt();
        System.out.println("Ingrese un valor numérico para el Número 2");
        num2 = TecladoIn.readLineInt();
        System.out.println("Ingrese un valor numérico para el Número 3");
        num3 = TecladoIn.readLineInt();

        /*Procesamiento*/
        num1++;
        num3--;
        igualdadNum1Num2 = (num1 == num2);
        igualdadNum2Num3 = (num2 == num3);
        igualdadDeLos3 = (igualdadNum1Num2 && igualdadNum2Num3);

        /*Salida*/
        System.out.println("El numero 1 y el numero 2 son iguales: " + igualdadNum1Num2);
        System.out.println("El numero 2 y el numero 3 son iguales: " + igualdadNum2Num3);
        System.out.println("El numero 1, numero 2 y numero 3 son iguales: " + igualdadDeLos3);
    }
    
}
