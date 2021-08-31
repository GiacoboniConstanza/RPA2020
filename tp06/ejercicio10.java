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
public class ejercicio10 
{
    public static void main (String [ ] args)
         {
             /*Este algoritmo evalua si corresponde aplicar descuentos y de cuanto*/
             double monto , desc;
             char clienteTipo;
             boolean aplicaDescuento;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el tipo de cliente: V para Vip, F para Frecuente u otra letra para ocasionales");
             clienteTipo = TecladoIn.readLineNonwhiteChar();
             System.out.println("Ingrese el monto de la compra");
             monto = TecladoIn.readLineDouble();
             
             /*Procesamiento*/
             aplicaDescuento = (monto > 5000) && (clienteTipo == 'V' || clienteTipo == 'F');
             desc = 10 * monto / 100;
             
             /*salida*/
             System.out.println("Corresponde aplicar el descuento: " + aplicaDescuento);
             System.out.println("En caso de aplicarse, el descuento es: " + desc);
         }
    
}
