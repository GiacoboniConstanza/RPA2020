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
public class promocionM1 {

    public static void main(String[] args) {

        String patente = "AVV123";
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
            valido = (validoL == true && validoN == true);

        } else {
            valido = false;
        }
        System.out.println("La patente es " + valido);
    }

}
