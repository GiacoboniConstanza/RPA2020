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
public class parcial2a {

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
                System.out.print(convertir(col) + "  ");
            }
            System.out.println(" ");
        }
    }

    public static char convertir(int col) {
        char letra;
        switch (col) {
            case 1: letra = 'A'; break;
            case 2: letra = 'B'; break;
            case 3: letra = 'C'; break;
            case 4: letra = 'D'; break;
            case 5: letra = 'E'; break;
            case 6: letra = 'F'; break;
            case 7: letra = 'G'; break;
            default: letra = '-'; break;
        }
        return letra;
    }

}
