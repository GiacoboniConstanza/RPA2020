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
public class promocionM8 {

    public static void main(String[] args) {
        String conjuntoPatentes = "AVV891HKQ015RST089", patenteMayor = "AAA000", patente, patenteL1, patenteN1, patenteL2, patenteN2;

        do {
            patente = conjuntoPatentes.substring(0, 6);
            conjuntoPatentes = conjuntoPatentes.replaceAll(patente, "");
            patenteL1 = patente.substring(0, 3);
            patenteN1 = patente.substring(3);
            patenteL2 = patenteMayor.substring(0, 3);
            patenteN2 = patenteMayor.substring(3);
            System.out.println(patente);
            System.out.println(patenteL1);

            if (patenteL1.compareTo(patenteL2) == 0) {
                if (patenteN2.compareTo(patenteN1) < 0) {
                    patenteMayor = patente;
                }
            } else if (patenteL1.compareTo(patenteL2) > 0) {
                patenteMayor = patente;
            }

        } while (!conjuntoPatentes.equals(""));
        System.out.println("La patente mayor es: " + patenteMayor);
    }

}
