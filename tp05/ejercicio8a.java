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
public class ejercicio8a 
{
    public static void main ( String [ ] args)
    {
        int a;
        int b;
        
        System.out.println("Ingrese el numero A");
        a = TecladoIn.readLineInt();
        
        System.out.println("Ingrese el numero B");
        b = TecladoIn.readLineInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("El valor de A ahora es: " + a);
        System.out.println("El valor de B ahora es: " + b);
    }
}
