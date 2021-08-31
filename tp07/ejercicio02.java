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
public class ejercicio02 {

    public static void main(String[] args) {
        int monto, b1000, b500, b200, b100;
        boolean retirar, totalBilletes;

        /*Ingreso de datos*/
        System.out.println("Ingrese el monto a retirar");
        monto = TecladoIn.readLineInt();

        /*Operaciones*/
        b1000 = monto / 1000;
        monto = monto % 1000;
        b500 = monto / 500;
        monto = monto % 500;
        b200 = monto / 200;
        monto = monto % 200;
        b100 = monto / 100;

        if ((retirar = (monto % 100) == 0) && (totalBilletes = (b1000 + b500 + b200 + b100) <= 20)) {
            System.out.println("Transaccion exitosa, se entregan: ");
            System.out.println(b1000 + " billetes de $1000");
            System.out.println(b500 + " billetes de $500");
            System.out.println(b200 + " billetes de $200");
            System.out.println(b100 + " billetes de $100");
        } else {
            System.out.println("No se puede realizar la extracción");
        }
    }

}
