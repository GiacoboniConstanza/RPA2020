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
public class ejercicio01 {

    public static void main(String[] args) {
        /*Este algoritmo determina si hoy es tu dia de cumpleaños, si ya paso o aun falta*/

        int diaHoy, mesHoy, diaCumple, mesCumple;
        boolean hoyCumple, faltaCumple, pasoCumple;

        /*Ingreso de datos*/
        System.out.println("Por favor ingrese el dia de su cumpleaños");
        diaCumple = TecladoIn.readLineInt();

        System.out.println("Por favor ingrese el mes de su cumpleaños");
        mesCumple = TecladoIn.readLineInt();

        System.out.println("Por favor ingrese el dia de hoy");
        diaHoy = TecladoIn.readLineInt();

        System.out.println("Por favor ingrese el mes de hoy");
        mesHoy = TecladoIn.readLineInt();

        /*Operaciones*/
        if (hoyCumple = ((diaCumple == diaHoy) && (mesCumple == mesHoy))) {
            System.out.println("Hoy es tu cumpleaños: " + hoyCumple);
        } else {
            System.out.println("No es tu cumpleaños");

        }

    }

}
