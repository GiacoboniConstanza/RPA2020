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
public class ejercicio09a {
     public static void main(String[] args) {

        int col, fila;
        for (fila = 1; fila <= 9; fila++) {
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
