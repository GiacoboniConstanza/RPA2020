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
public class ejercicio03
{
    public static void main (String [ ] args)
         {
             int codigo , region , provincia ;
             boolean destinoPatagonia , patagoniaNorte ;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el codigo del paquete");
             codigo = TecladoIn.readLineInt();
             
             /*Procesamiento*/
             provincia = codigo % 100;
             region = codigo % 10000;
             region = region / 100;
            
             
             destinoPatagonia = region == 22;
             patagoniaNorte = ((provincia == 15) || (provincia == 14));
             
             /*Salida*/
             System.out.println("Region destino: " + region);
             System.out.println("Provincia destino: " + provincia);
             System.out.println("Destino patagonia: " + destinoPatagonia);
             System.out.println("Destino patagonia norte: " + patagoniaNorte);
         }   
    
}
