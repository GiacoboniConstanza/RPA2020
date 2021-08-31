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
public class ejercicio02 {
    public static void main(String[] args) {
        /*Problema 02: Contar la cantidad de ocurrencias de un carácter
Dada una oración y un carácter, se pide desarrollar un programa que cuente la cantidad de
ocurrencias existencia del carácter en la oración ingresada.
*/
        int contar=0, i;
        String oracion;
        char caracter;
        
        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();
        System.out.println("Ingrese el caracter a verificar");
        caracter = TecladoIn.readLineNonwhiteChar();
        for(i=0;i<oracion.length();i++){
            if (caracter == oracion.charAt(i)){
                contar++;
            }
        }
        System.out.println("Cantidad de ocurrencias de " + caracter + " es " + contar);
    }
    
}
