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
public class parcial2b {

    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un número entero entre 1 y 7");
        num = TecladoIn.readLineInt();
        if (num > 1 && num < 7) {
            piramide1(num);
        } else {
            System.out.println("El número ingresado es invalido");
        }
    }

    public static void piramide1(int n) {
        int fila, col;
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= n - fila + 1; col++) {
                System.out.print(col + "  ");
            }
            System.out.println(" ");
        }
    }
}
