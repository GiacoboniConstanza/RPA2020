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
public class ejercicio05 {

    public static void main(String[] args) {

        int i, temp, tempDia = 0, tempSemana = 0, dia, diaMax = 0;
        for (dia = 1; dia <= 7; dia++) {
            System.out.println("Hoy es el dia " + dia + " de la semana");
            for (i = 1; i <= 4; i++) {
                System.out.println("Ingrese la temperatura");
                temp = TecladoIn.readLineInt();
                if (temp > tempDia) {
                    tempDia = temp;
                }

            }
            if (tempDia > tempSemana) {
                tempSemana = tempDia;
                diaMax = dia;
            }
        }
        System.out.println("La temperatura maxima fue " + tempSemana + " el dia " + diaMax);
    }

}
