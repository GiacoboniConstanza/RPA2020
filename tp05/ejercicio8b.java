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
public class ejercicio8b 
{
    public static void main ( String [ ] args)
          {
              int a ,b , c;
        
        /*Ingreso de datos*/
            System.out.println("Ingrese el numero A");
            a = TecladoIn.readLineInt();
            System.out.println("Ingrese el numero B");
            b = TecladoIn.readLineInt();
            System.out.println("Ingrese el numero C");
            c = TecladoIn.readLineInt();

            /*Procesamiento*/
            a = a + c;
            c = a - c;
            
            System.out.println("El valor de C ahora es: " + c);

            a = a - c;
            a = a + b;
            b = a - b;
            
            System.out.println("El valor de B ahora es: " + b);
            
            a = a - b;
            
            System.out.println("El valor de A ahora es: " + a);
          }  
}
