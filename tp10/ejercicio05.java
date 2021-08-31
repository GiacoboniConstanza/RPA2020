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
public class ejercicio05 {
     public static void main(String[] args) {
         /*Problema 05: Contraseña segura
Un forma de determinar si una contraseña es segura es verificar que contenga al menos un número,
al menos una letra y que su longitud supere los 6 caracteres.
Desarrollar un programa que pida una contraseña y verifique que se trate de una contraseña segura.
Deben permitirse varios intentos hasta que se ingrese una contraseña segura.
*/
        boolean seguro;
        String contrasena;
        do {
            System.out.println("Ingrese una contraseña");
            contrasena = TecladoIn.readLine();
            seguro = numero(contrasena) == true && letra(contrasena) == true && longitud(contrasena) == true;
            System.out.println("La contraseña es " + seguro);
        } while (seguro != true);
    }

    public static boolean numero(String contrasena) {
        int i = 0;
        boolean existencia1 = false;
        while (i < contrasena.length() && existencia1 == false) {
            if (Character.isDigit(contrasena.charAt(i))) {
                existencia1 = true;
            }
            i++;
        }
        return existencia1;
    }

    public static boolean letra(String contrasena) {
        int i = 0;
        boolean existencia2 = false;
        while (i < contrasena.length() && existencia2 == false) {
            if (Character.isLetter(contrasena.charAt(i))) {
                existencia2 = true;
            }
            i++;
        }
        return existencia2;
    }

    public static boolean longitud(String contrasena) {
        int i = 0;
        boolean longitud;
        longitud = contrasena.length() >= 6;
        return longitud;
    }
}
