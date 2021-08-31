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
public class ejercicio04 
{
    public static void main (String [ ] args)
         {
             double monto, montoFinal;
             char pago, rubro;
             boolean promoEfectivo, promoCamisasRemeras, promoDebito;

             /*Ingreso de datos*/
             System.out.println("Ingrese el monto");
             monto = TecladoIn.readLineInt();
             System.out.println("Ingrese forma de pago");
             pago = TecladoIn.readLineNonwhiteChar();
             System.out.println("Ingrese rubro");
             rubro = TecladoIn.readLineNonwhiteChar();

             /*Procesamiento*/
             if (promoEfectivo = (monto > 5000) && (monto < 10000) && (pago == 'e')) {
                 System.out.println("Aplica al descuento de Efectivo");
                 System.out.println("Monto original: " + monto);
                 montoFinal = monto - (monto * 50 / 100);
                 System.out.println("Monto a pagar con el descuento: " + montoFinal);
             } else if (promoCamisasRemeras = ((rubro == 'c') || (rubro == 'r')) && promoEfectivo == false) {
                 System.out.println("Aplica al descuento de Camisas o Remeras");
                 System.out.println("Monto original: " + monto);
                 montoFinal = monto - (monto * 30 / 100);
                 System.out.println("Monto a pagar con el descuento es: " + montoFinal);
             } else if (promoDebito = (monto > 5000) && (monto < 10000) && (pago == 'd')){
                 System.out.println("Aplica al descuento de Debito");
                 System.out.println("Monto original: " + monto);
                 montoFinal = monto - (monto * 20 / 100);
                 System.out.println("Monto a pagar con el descuento: " + montoFinal);
             } else {
                 System.out.println("No aplica ningun descuento");
                 System.out.println("Monto a pagar: " + monto);
             }
                     
                         
                 
         }
    
}
