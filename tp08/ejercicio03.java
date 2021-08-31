/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp08;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio03 {

    public static void main(String[] args) {

        int contrasena = 0, acumulador = 0;

        while (acumulador < 5 && contrasena != 690105){
            System.out.println("Ingrese la contraseña");
            contrasena = TecladoIn.readLineInt();
            acumulador++;
            System.out.println("Intento: " + acumulador);
        }
        System.out.println("Recuerde la contraseña, por favor");
    }

}
