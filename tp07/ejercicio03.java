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
public class ejercicio03 
{
    public static void main(String[] args) 
    {
        int codigo , region ;
             boolean destinoPatagonia ;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el codigo del paquete");
             codigo = TecladoIn.readLineInt();
             
             /*Procesamiento*/
             
             region = codigo % 10000;
             region = region / 100;
            
             
             if (destinoPatagonia = region == 22)
                 System.out.println("El envio tiene destino Patagonia");
             else
                 System.out.println("El envio no tiene destino Patagonia");
             
             
             
    }
}
