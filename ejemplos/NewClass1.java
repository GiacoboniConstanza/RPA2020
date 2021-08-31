/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class NewClass1 {

    public static void main(String[] args) {
        int n, fila, col;
        System.out.println("Ingrese n");
        n = TecladoIn.readLineInt();
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= fila; col++) {
                if (col % 2 == 0) {
                    System.out.print(col + " ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println(" ");
        }
    }

}
