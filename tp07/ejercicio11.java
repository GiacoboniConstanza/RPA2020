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
public class ejercicio11 
{
    public static void main (String [ ] args)
       {
           double monto, montoFinal;
           int cuotas;

           /*Ingreso de datos*/
           System.out.println("Ingrese el monto");
           monto = TecladoIn.readLineDouble();
           System.out.println("Ingrese la cantidad de cuotas");
           cuotas = TecladoIn.readLineInt();

           /*Procesamiento*/
           switch (cuotas) {
               case 1:
                   System.out.println("Sin interes");
                   System.out.println("Monto a pagar: " + monto);
                   break;
               case 2:
                   System.out.println("Sin interes");
                   System.out.println("Monto a pagar: " + monto);
                   break;
               case 3:
                   System.out.println("Sin interes");
                   System.out.println("Monto a pagar: " + monto);
                   break;
               case 4:
                   System.out.println("10% de interes");
                   montoFinal = monto + (monto * 10 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 5:
                   System.out.println("10% de interes");
                   montoFinal = monto + (monto * 10 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 6:
                   System.out.println("10% de interes");
                   montoFinal = monto + (monto * 10 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 7:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 8:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 9:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 10:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 11:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               case 12:
                   System.out.println("20% de interes");
                   montoFinal = monto + (monto * 20 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
               default:
                   System.out.println("60% de interes");
                   montoFinal = monto + (monto * 60 / 100);
                   System.out.println("Monto a pagar: " + montoFinal);
                   break;
           }
       }
    
}
