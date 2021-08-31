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
public class ejercicio03 {

    public static void main(String[] args) {

        int opcion, n;
        boolean continuar;
        do {
            System.out.println("Ingrese que piramide quiere realizar");
            System.out.println("Las opciones son: 1, 2 o 3");
            opcion = TecladoIn.readLineInt();
            System.out.println("Ingrese un valor entero");
            n = TecladoIn.readLineInt();
            switch (opcion) {
                case 1:
                    repetir(n);
                    break;
                case 2:
                    consecutivo(n);
                    break;
                case 3:
                    multiplicar(n);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("Desea hacer otra piramide?");
            continuar = TecladoIn.readLineBoolean();
        } while (continuar);
    }

    public static void repetir(int n) {
        int fila, col;
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print(fila + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void consecutivo(int n) {
        int fila, col;
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print(col + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void multiplicar(int n) {
        int fila, col;
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print(fila*col + "  ");
            }
            System.out.println("  ");
        }
    }

}
