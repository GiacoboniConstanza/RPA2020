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
public class ejercicio02 
{
    public static void main (String [ ] args)
            {
                /*Este algoritmo analiza si se puede realizar una extraccion de un cajero,
                cuantos billetes entrega y si son menor o igual a 20*/
                
                int monto, b1000, b500, b200, b100;
                boolean retirar, totalBilletes;
                        
                /*Ingreso de datos*/
                System.out.println("Ingrese el monto a retirar");
                monto = TecladoIn.readLineInt();
                
                /*Operaciones*/
                retirar = (monto % 100) == 0;
                b1000 = monto / 1000;
                monto = monto % 1000;
                b500 = monto / 500;
                monto = monto % 500;
                b200 = monto / 200;
                monto = monto % 200;
                b100 = monto / 100;
                totalBilletes = (b1000 + b500 + b200 + b100) <= 20;
                
                /*Salida*/
                System.out.println("Es posible retirar ese monto: " + retirar);
                System.out.println(b1000 + " billetes de $1000");
                System.out.println(b500 + " billetes de $500");
                System.out.println( b200 + " billetes de $200");
                System.out.println(b100 + " billetes de $100");
                System.out.println("Se puede realizar la operacion porque no excede los 20 billetes: " + totalBilletes);
                       
            }
    
}
