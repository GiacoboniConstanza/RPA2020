/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

/**
 *
 * @author Coqui
 */
public class ejercicio09b {

    public static void main(String[] args) {

        int col, fila;
        System.out.println("x||   1|   2|   3|   4|   5|   6|   7|   8|   9| ");
        System.out.println("------------------------------------------------ ");
        for (fila = 2; fila <= 9; fila++) {
            System.out.print(fila + " || ");
            for (col = 1; col <= 9; col++) {
                if (fila * col < 10) {
                    System.out.print(" " + fila * col + "|  ");
                } else {
                    System.out.print(fila * col + "|  ");
                }
            }
            System.out.println(" ");
        }
    }

}
