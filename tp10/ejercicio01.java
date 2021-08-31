/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio01 {
    public static void main(String[] args) {
       /*Problema 01: Verificar la existencia de un carácter
Dada una oración y un carácter, se pide desarrollar un programa que verifique la existencia del
carácter en la oración ingresada.
*/ 
        String oracion;
        char caracter;

        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();
        System.out.println("Ingrese el caracter a verificar");
        caracter = TecladoIn.readLineNonwhiteChar();
        System.out.println(verExistencia(oracion,caracter));


    }
    public static boolean verExistencia (String oracion, char caract){
      int i = 0;
      boolean encontrado = false;
        while (encontrado == false && i < oracion.length()) {
            if (caract == oracion.charAt(i)) {
                encontrado = true;
            }
            i++;
        } 
        return encontrado;
    }
}