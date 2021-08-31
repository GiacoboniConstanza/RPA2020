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
public class ejercicio04 {
    public static void main(String[] args) {
        /*Problema 04: ¿Tiene vocales?
Construir un programa que permita verificar la existencia de vocales en una cadena de caracteres*/
        String oracion;
        
        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();
        System.out.println("Hay alguna vocal: " + vocales(oracion));
        
    }
    public static boolean vocales (String oracion){
        boolean vocal=false;
        int i=0;
        while(i<oracion.length() && vocal == false){
            if(oracion.charAt(i)== 'A'||oracion.charAt(i)== 'a'||oracion.charAt(i)== 'I'||oracion.charAt(i)== 'i'||oracion.charAt(i)== 'E'||oracion.charAt(i)== 'e'||oracion.charAt(i)== 'O'||oracion.charAt(i)== 'o'||oracion.charAt(i)== 'U'||oracion.charAt(i)== 'u'){
                vocal=true;
            }
            i++;
        }
        return vocal;
    }
}
