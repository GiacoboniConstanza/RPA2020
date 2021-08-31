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
public class ejercicio01 {

    public static void main(String[] args) {

        char vidriera, género, a = 1, b = 1, c = 1, d = 1, e = 1, f = 1;
        boolean continuar;
        do {
            System.out.println("ingrese su género.\n"
                    + "F)Femenino.\n"
                    + "M)Masculino.");
            género = TecladoIn.readLineNonwhiteChar();
            if ((género == 'M') || (género == 'm')) {
                System.out.println("Ingrese cual viedrera es de su preferencia.\n"
                        + "A)Ropa y zapatos.\n"
                        + "B)Accesorios.\n"
                        + "C)Artículos de belleza y perfumería.");
                vidriera = TecladoIn.readLineNonwhiteChar();
                switch (vidriera) {
                    case 'A':
                        a++;
                        break;
                    case 'B':
                        b++;
                        break;
                    case 'C':
                        c++;
                        break;
                    default:
                        System.out.println("solo existen las opciones A, B o C");
                }
            }
            if ((género == 'F') || (género == 'f')) {
                System.out.println("Ingrese cual viedrera es de su preferencia.\n"
                        + "A)Ropa y zapatos.\n"
                        + "B)Accesorios.\n"
                        + "C)Artículos de belleza y perfumería.");
                vidriera = TecladoIn.readLineNonwhiteChar();
                switch (vidriera) {
                    case 'A':
                        d++;
                        break;
                    case 'B':
                        e++;
                        break;
                    case 'C':
                        f++;
                        break;
                    default:
                        System.out.println("solo existen las opciones A, B o C");
                }
            }
            System.out.println("Desea continuar?");
            continuar = TecladoIn.readLineBoolean();
        }while(continuar);
        if ((d > e) && (d > f)) {
            System.out.println("Las mujeres prefieren las vidrieras de Ropa y Zapatos");
        }
        if ((e > d) && (e > f)) {
            System.out.println("Las mujeres prefieren las vidrieras de Accesorios");
        }
        if ((f > d) && (f > e)) {
            System.out.println("Las mujeres prefieren las vidrieras de Artículos de belleza");
        }
        if ((a > b) && (a > c)) {
            System.out.println("Los hombres prefieren las vidrieras de Ropa y Zapatos");
        }
        if ((b > a) && (b > c)) {
            System.out.println("Los hombres prefieren las vidrieras de Accesorios");
        }
        if ((c > a) && (c > b)) {
            System.out.println("Las hombres prefieren las vidrieras de Artículos de belleza");
        }
    }

}

