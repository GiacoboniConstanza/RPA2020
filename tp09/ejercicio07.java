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
public class ejercicio07 {

    public static void main(String[] args) {

        double totalDia, totalSemana = 0, montoDia;
        int dia, caja;
        for (dia = 1; dia <= 2; dia++) {
            totalDia = 0;
            for (caja = 1; caja <= 2; caja++) {
                System.out.println("Ingrese el monto de la caja");
                montoDia = TecladoIn.readLineDouble();
                totalDia = totalDia + montoDia;
            }
            System.out.println("La recuadacion del dia es $" + totalDia);
            totalSemana = totalSemana + totalDia;
        }
        System.out.println("La recaudacion de la semana es $" + totalSemana);
    }

}
