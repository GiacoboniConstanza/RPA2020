
import Utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Coqui
 */
public class parcial02c {

    public static void main(String[] args) {
        int i;
        String cadena, resultado = "";
        System.out.println("Ingrese una cadena");
        cadena = TecladoIn.readLine();

        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '[' || cadena.charAt(i) == ']' || cadena.charAt(i) == '(' || cadena.charAt(i) == ')') {
                resultado = resultado + '*';
            } else {
                resultado = resultado + cadena.charAt(i);
            }
        }
        System.out.println("El resultado es " + resultado);
    }

}
