package promocion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Coqui
 */
public class promocionM2 {
//modificar el modulo 1 para q retorne validoL y validoN para invocarlo
    // en este modulo tiene q quedar unicamente los if anidados
    public static void main(String[] args) {

        String patente = "A1VC23C";
        int i=0;
        boolean validoL = true, validoN = true, valido;

        if (patente.length() == 6) {

            do {

                validoL = Character.isLetter(patente.charAt(i));
                i++;
            } while (validoL && i <= 2);
            i=3;
            do {

                validoN = Character.isDigit(patente.charAt(i));
                i++;
            }while(validoN && i<=5);
            if (validoL == true && validoN == false) {
                System.out.println("Los numeros de la patente no son validos");
            } else if (validoL == false && validoN == true) {
                System.out.println("Las letras de la patente no son validas");
            } else if (validoL == false && validoN == false) {
                System.out.println("Las letras y los numeros no son validos");
            } else if (validoL == true && validoN == true) {
                System.out.println("La patente es valida");
            }

        } else {
            valido = false;
            System.out.println("El largo de la patente es invalida");
        }
    }

}
