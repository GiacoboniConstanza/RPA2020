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
public class ejercicio03 {
    public static void main(String[] args) {
        /*Problema 03: Cuenta números y letras
Construir un programa que permita contar la cantidad de números y letras que contiene una cadena
de caracteres.
Obs: Se recomienda utilizar los módulos esLetra (ch) y esDigito (ch) donde ch es una variable de tipo
carácter. En java Character.isLetter(ch) y Character.isDigit(codePoint).
*/
        int contarL=0,contarN=0, i;
        String oracion;
        
        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();
        
        for(i=0;i<oracion.length();i++){
            if (Character.isLetter(oracion.charAt(i))){
                contarL++;
            } else {
                if (Character.isDigit(oracion.charAt(i))){
                    contarN++;
                }
            }
        }
        System.out.println("La cantidad de letras es " + contarL + " y la de numeros es " + contarN);
    }
    
}
