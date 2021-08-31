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
public class ejercicio04 
{
    public static void main (String [ ] args)
         {
             double monto;
             char pago , rubro ;
             boolean promoEfectivo , promoCamisasRemeras , promoDebito ;
             
             /*Ingreso de datos*/
             System.out.println("Ingrese el monto");
             monto = TecladoIn.readLineInt();
             System.out.println("Ingrese forma de pago");
             pago = TecladoIn.readLineNonwhiteChar();
             System.out.println("Ingrese rubro");
             rubro = TecladoIn.readLineNonwhiteChar();
             
             /*Procesamiento*/
             promoEfectivo = (monto > 5000) && (monto < 10000) && (pago == 'e');
             promoCamisasRemeras = ((rubro == 'c') || (rubro == 'r')) && promoEfectivo == false;
             promoDebito = (monto > 5000) && (monto < 10000) && (pago == 'd');
             
             /*Salida*/
             System.out.println("Promocion efectivo (50%): " + promoEfectivo);
             System.out.println("Promocion Camisas y Remeras (30%): " + promoCamisasRemeras);
             System.out.println("Promocion debito (20%): " + promoDebito);
         }
    
}
