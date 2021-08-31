/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp08;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio07 {

    public static void main(String[] args) {

        int num, numMayor = 0;
        boolean continuar;

        do {
            System.out.println("Ingrese un numero");
            num = TecladoIn.readLineInt();
            if (num > numMayor) {
                numMayor = num;
            }
            System.out.println("Desea continuar? Si: true No: false");
            continuar = TecladoIn.readLineBoolean();
        } while (continuar != false);
        System.out.println("El numero mayor ingresado fue: " + numMayor);
    }

}
