/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio04 {

    public static void main(String[] args) {

        boolean continuar;
        double puntaje, totalPuntaje;
        int aprobados = 0, desaprobados = 0, i;
        do {
            totalPuntaje = 0;
            for (i = 1; i <= 5; i++) {
                System.out.println("Ingrese nota del inciso " + i);
                puntaje = TecladoIn.readLineDouble();
                if (puntaje <= 20) {
                    totalPuntaje = totalPuntaje + puntaje;
                } else {
                    System.out.println("Nota invalida");
                    i = i--;
                }
            }
            if (totalPuntaje >= 60) {
                aprobados = aprobados + 1;
            } else {
                desaprobados = desaprobados + 1;
            }
            System.out.println("La nota total es " + totalPuntaje);
            System.out.println("Desea continuar?");
            continuar = TecladoIn.readLineBoolean();
        } while (continuar);
        System.out.println("Hay " + aprobados + " alumnos aprobados y " + desaprobados + " alumnos desaprobados");
    }

}
